# -*-coding:utf-8
import subprocess
import os
import sys
import re
import configparser
from datetime import datetime
from pathlib import Path
import threading
import platform
from time import sleep
import traceback
import logging

config = configparser.ConfigParser()
config.read('setting.ini', encoding='utf-8-sig')
log_path = Path.cwd().parent / 'log'
run_path = Path.cwd()
start_time = datetime.now()
test_time = re.findall(r'\d+', config.get('monkey', 'test time'))


def start_monkey():
    """ Start Monkey"""
    devices = get_devices()
    if not devices:
        logger.info('No devices found. Exit')
        return
    else:
        with open('setting.ini', 'w') as f:
            config.set('monkey', 'start time',
                       value=start_time.strftime("%Y%m%d_%H%M%S"))
            config.write(f)
        logger.info("Find devices:\n{}".format(devices))
        assert_monkey_ps(True)
        thread_pull = threading.Thread(target=pull_mtklog)
        thread_pull.setDaemon(True)
        thread_pull.start()
        os.chdir(str(run_path))
        try:
            while True:
                sys.stdout.flush()
                run_time = datetime.now() - start_time
                logger.info('Running time: {}s'.format(
                    run_time))
                if int(test_time[0]) * 3600 <= int(run_time.seconds):
                    logger.info("Test Timeout!")
                    break
                if not thread_pull.is_alive():
                    thread_pull = threading.Thread(target=pull_mtklog)
                    thread_pull.setDaemon(True)
                    thread_pull.start()
                assert_monkey_ps(True)
                sleep(300)
        except KeyboardInterrupt:
            logger.info('Monkey Interrupt because key Abort')
        except Exception:
            traceback.print_exc()
        finally:
            assert_monkey_ps(False)
            thread_pull.join()
            logger.info('Monkey test finished!')
            for _ in range(100):
                logger.info('Process will exit after {} seconds!'.format(100 - _))
                # logger.info(thread_pull.is_alive())
                sleep(1)
            logger.info('Exit!')


def get_devices():
    pipe = subprocess.Popen(
        'adb devices', stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    if not pipe.stderr:
        logger.info('No adb found,please install adb! Abort test')
        return False
    devices = re.findall(r'\s(\S+)\tdevice',
                         pipe.stdout.read().decode('utf-8'))
    return devices


def run_monkey(serial_no):
    logger.info("Push blacklist...")
    subprocess.Popen('adb -s {0} push blacklist.txt /sdcard/'.format(serial_no), shell=True)
    monkey_command = config.get('monkey', 'command')
    # logger.info('adb -s {0} shell {1} '.format(serial_no, monkey_command))
    run_cmd = 'start /b adb -s {0} shell "{1}" >> {2}/monkey-{0}-{3}.txt'
    if platform.system().__eq__('Linux'):
        run_cmd = 'adb -s {0} shell "{1}" >> {2}/monkey-{0}-{3}.txt &'
    logger.info(run_cmd.format(
        serial_no, monkey_command, log_path / 'Monkey-log', start_time.strftime("%Y%m%d%H%M%S")))
    subprocess.Popen(
        run_cmd.format(
            serial_no, monkey_command, log_path / 'Monkey-log', start_time.strftime("%Y%m%d%H%M%S")),
        shell=True)


def assert_monkey_ps(is_continue=True):
    devices = get_devices()
    if not devices:
        logger.info('No devices found!')
        return
    assert_cmd = "adb -s {0} shell ps | findstr monkey"
    if platform.system().__eq__('Linux'):
        assert_cmd = 'adb -s {0} shell ps | grep monkey'
    for serial_no in devices:
        monkey_ps = subprocess.Popen(assert_cmd.format(serial_no), shell=True,
                                     stdout=subprocess.PIPE)
        is_monkey_run = False
        while True:
            ps_id = monkey_ps.stdout.readline()
            if ps_id:
                is_monkey_run = True
                if is_continue:
                    logger.info('Monkey still running in the devices {}'.format(serial_no))
                else:
                    pid = re.findall(
                        r'\d+', re.findall(r'shell\s+\d+', ps_id.decode('utf-8'))[0])[0]
                    subprocess.Popen('adb -s {0} shell kill {1}'.format(serial_no, pid), shell=True,
                                     stdout=subprocess.PIPE)
            else:
                if is_continue and not is_monkey_run:
                    logger.info('Restart monkey  in the devices {}'.format(serial_no))
                    run_monkey(serial_no)
                break


def pull_mtklog():
    try:
        log_exe = 'LoNg.jar'
        thread_pull_log = subprocess.Popen("java -jar {} start".format(
            log_exe), shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, cwd=str(log_path))

        while thread_pull_log.poll() is None:
            # logger.info("end")
            # logger.info(thread_pull_log.stderr.readline().decode('utf-8', 'ignore'))
            stout = thread_pull_log.stdout.readline().decode('utf-8', 'ignore')
            logger.info(stout)
    except Exception:
        thread_pull_log.terminate()
        logger.info("Thread pull log Abort")
        traceback.print_exc()


if __name__ == '__main__':
    logger = logging.getLogger('main')
    logger.setLevel(level=logging.DEBUG)

    if not test_time:
        logger.info("Set running time {} Fail".format(test_time))
    start_monkey()
