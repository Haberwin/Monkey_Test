# -*-coding:utf-8

import subprocess
import os
import re
import configparser
from datetime import datetime
from pathlib import Path
from time import sleep

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
        print('No devices found. Exit')
        return
    else:
        with open('../Main/setting.ini', 'w') as f:
            config.set('monkey', 'start time',
                       value=start_time.strftime("%Y%m%d_%H%M%S"))
            config.write(f)
        print("Find devices:\n{}".format(devices))
        for no in devices:
            assert_monkey_ps(True)
            # push_blacklist(no)
            # run_monkey(no)
        thread_pull = pull_mtklog()
        os.chdir(str(run_path))
        try:
            while True:
                stout = thread_pull.stdout.readline().decode('utf-8', 'ignore')
                print(stout)
                if re.search(r'Sleep \d+s', stout):
                    print('Running time: {}'.format(
                        datetime.now() - start_time))
                    if test_time and int(test_time[0]) * 3600 > int((datetime.now() - start_time).seconds):
                        assert_monkey_ps(True)
                        sleep(3)
                        continue
                    else:
                        break
        except KeyboardInterrupt:
            print('Monkey Interrupt because key Abort')
        finally:
            assert_monkey_ps(False)
            print('Monkey test finished!')
            for _ in range(100):
                print('Process will exit after {} seconds!'.format(100 - _))
                sleep(1)
            thread_pull.terminate()
            print('Exit!')


def get_devices():
    pipe = subprocess.Popen(
        'adb devices', stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)

    if not pipe.stderr:
        print('No adb found,please install adb! Abort test')
        return False
    devices = re.findall(r'\s(\S+)\tdevice',
                         pipe.stdout.read().decode('utf-8'))
    return devices


def run_monkey(serial_no):
    print("Push blacklist...")
    subprocess.Popen('adb -s {0} push blacklist.txt /sdcard/'.format(serial_no))
    monkey_command = config.get('monkey', 'command')
    print('adb -s {0} shell {1} '.format(serial_no, monkey_command))
    subprocess.Popen(
        'start /b adb -s {0} shell "{1}" > {2}/monkey-{0}-{3}.txt'.format(
            serial_no, monkey_command, log_path / 'Monkey-log', datetime.now().strftime("%Y%m%d%H%M%S")),
        shell=True)


def assert_monkey_ps(do_next=True):
    devices = get_devices()
    if not devices:
        print('No devices found!')
        return
    for serial_no in devices:

        monkey_ps = subprocess.Popen('adb -s {0} shell ps | findstr monkey'.format(serial_no), shell=True,
                                     stdout=subprocess.PIPE)
        is_monkey_run = False
        while True:
            ps_id = monkey_ps.stdout.readline()
            if ps_id != b'':
                is_monkey_run = True
                if do_next:
                    print('Monkey still running in the devices {}'.format(serial_no))
                else:
                    pid = re.findall(
                        r'\d+', re.findall(r'shell\s+\d+', ps_id.decode('utf-8'))[0])[0]
                    subprocess.Popen('adb -s {0} shell kill {1}'.format(serial_no, pid), shell=True,
                                     stdout=subprocess.PIPE)
            else:
                if do_next and not is_monkey_run:
                    print('Restart monkey  in the devices {}'.format(serial_no))
                    run_monkey(serial_no)
                break


def pull_mtklog():
    log_exe = 'LoNg.jar'
    os.chdir(str(log_path))
    thread_pull_log = subprocess.Popen('java -jar {} start'.format(
        log_exe), shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    while not thread_pull_log.poll():
        stout = thread_pull_log.stdout.readline().decode('utf-8', 'ignore')
        print(stout)
    print("Thread pull log Abort")


if __name__ == '__main__':
    start_monkey()
