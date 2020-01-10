# -*-coding:utf-8 -*-
import configparser
import os
import platform
import subprocess
import urllib
import urllib.request
import zipfile
from datetime import datetime
from pathlib import Path
from time import sleep
import traceback
from Modules.CreateRedmine import CreateRedmine
from Modules.SmbCommunicate import SmbCommunicate
from collections import namedtuple

class ParseLog(object):
    Exception_list = []  # 存储dbg文件列表
    Issue_Subject = ""
    Issue_Description = ""
    aee_dict = {}  # 存储发生了的异常
    ParseDir_List = []  # 存储已经解析过的文件夹
    zip_folder = []  # 存储已经压缩过的文件夹
    def __init__(self, aee_path, log_path):
        self.log_path = log_path
        self.aee_path = aee_path

    def check_log(self, start_time, log_url):
        start_time = datetime.strptime(start_time, "%Y%m%d_%H%M%S")
        for _ in self.log_path.iterdir():
            if _.is_dir() and datetime.strptime(_.name, "%Y%m%d_%H%M%S") >= start_time:
                self.ParseDir_List.append(_)
                aee_type = []
                aee_parent_path = []
                aee_info = []
                aee_err_package = []
                aee_err_time = []
                aee_parent = []
                for dbg_file in _.glob(r'**/*.dbg'):
                    self.Exception_list.append(dbg_file)
                    self.parse_log(dbg_file)
                    print("Find dbg file:{}".format(dbg_file))
                    # sleep(5)

                    for zz_internal in dbg_file.parent.glob(r'ZZ_INTERNAL*'):

                        aee_parent.append(dbg_file.relative_to(self.log_path))
                        with zz_internal.open(mode='r') as f:

                            result = f.read()
                            print(result)
                            tmp_list = result.split(',')
                            if len(tmp_list) <= 1:
                                print("Invalid file, skip......")
                                continue
                            if tmp_list[0] in self.aee_dict.keys():
                                self.aee_dict[tmp_list[0]] += 1
                            else:
                                self.aee_dict[tmp_list[0]] = 1
                            aee_type.append(tmp_list[0])
                            aee_parent_path.append(tmp_list[4])
                            aee_info.append(tmp_list[6])
                            aee_err_package.append(tmp_list[7])
                            aee_err_time.append(tmp_list[8])
                self.Issue_Subject = '[bug](monkey test)Total Error:{};'.format(
                    len(aee_type))
                for k, v in self.aee_dict.items():
                    self.Issue_Subject = self.Issue_Subject + \
                                         '{0}:  {1} times;'.format(k, v)

                for index in range(len(aee_type)):
                    self.Issue_Description = self.Issue_Description + (
                        f'\r\nNO.{index}\t{aee_type[index]}\r\nInfo:{aee_info[index]} in the module {aee_err_package[index]} at {aee_err_time[index]},error path:{aee_parent_path[index]} \n AEE file path:\r\n{log_url}{aee_parent[index]}')
        print(self.aee_dict)
        print(self.Issue_Description)
        with open("../Main/Report.txt", "w") as report:
            report.write(self.Issue_Description)

    def create_issue(self, redmine_url, project_issue, assigned_to):
        """
        创建bug
        参数 redmine_url:redmine服务器地址
        参数 project_issue:目标项目下的一个issue号
        参数 assigned_to:指派人的账号
        """
        if len(self.aee_dict) and check_url(redmine_url):
            monkey_bug = CreateRedmine(redmine_url=redmine_url)
            monkey_bug.set_project_id(project_issue)
            monkey_bug.set_parameter(subject=self.Issue_Subject, description=self.Issue_Description,
                                     assigned=assigned_to)
            monkey_bug.creat_isses()
            print("Create issue success.")

    def parse_log(self, dbg_file):
        subprocess.Popen('{exec_aee} {arg}'.format(
            exec_aee=self.aee_path, arg=dbg_file), stdout=subprocess.PIPE, stderr=subprocess.PIPE)

    def zip_and_upload(self, smb_server,root_path, shard, folder, list_dbg=None):
        """
        压缩并上传log
        :param smb_server: smb服务器地址
        :param root_path:放置压缩文件的根目录
        :param shard:SMB服务器的Shard目录，如Temp
        :param folder:SMB Shard目录下防止zip文件的路径，如 log/monkey-log
        :param list_dbg:存放dbg文件的列表
        """

        print("start zip")
        if not list_dbg:
            print("No dbg file found!")
            return
        main_root = os.getcwd()
        os.chdir(str(root_path))
        print(os.getcwd())
        zip_name = str(root_path) + '.zip'
        with zipfile.ZipFile(zip_name, 'w', zipfile.ZIP_DEFLATED) as z:
            print("list")
            print(list_dbg)
            for dgb_file in list_dbg:
                if root_path not in dgb_file.parents:
                    continue
                for exp_folder in dgb_file.parents:
                    if str(exp_folder).endswith("exception") and exp_folder not in self.zip_folder:
                        for f in self.zip_dir(exp_folder):
                            z.write(str(f.relative_to(root_path)))
                            print('zip file:{}'.format(f))
                        self.zip_folder.append(exp_folder)
        smb.upload_file(
            zip_name, shard, "{0}/{1}.zip".format(folder, root_path.name))
        print("remove file:{}".format(zip_name))
        os.remove(zip_name)
        os.chdir(main_root)
        #print(os.getcwd())

    def zip_dir(self, source_dir):
        path_list=[]
        for files in source_dir.iterdir():
            path_list.append(files)
            if files.is_dir():
                self.zip_dir(files)
        return (path_list)


def check_url(test_url):
    opener = urllib.request.build_opener()
    opener.add_handler = []
    # test_url = 'http://192.168.3.75:8006/redmine'
    try:
        opener.open(test_url, timeout=3)
        print('Network connection available:{}'.format(test_url))
        return True
    except urllib.error.HTTPError:
        print('无法访问{}'.format(test_url))
        return False
    except urllib.error.URLError:
        print('无法访问{}'.format(test_url))
        return False
    except Exception as err:
        print(err)
        return False
        # if True:
        #     print("zip")
        #     Do_Zip(root_path, exception_list)
        # with open('Result.txt', 'w') as result:
        #     result.write(description)
        # print(description)


if __name__ == "__main__":
    config = configparser.ConfigParser()
    config.read('setting.ini', encoding='utf-8-sig')
    print(config.sections)
    project_issue = config.get('Redmine', 'project issue')
    create_bug = config.get('Redmine', 'creat bug')
    start_time = config.get('monkey', 'start time')
    assigned_to = config.get('Redmine', 'assigned to id')
    redmine_url = config.get('Redmine', 'url')
    upload_log = config.get('SMBServer', 'uploadlog')
    smb_url = config.get('SMBServer', 'url')
    smb_port = int(config.get('SMBServer', 'port'))
    smb_user = config.get('SMBServer', 'name')
    smb_psw = config.get('SMBServer', 'password')
    smb_shard = config.get('SMBServer', 'shard')
    upload_path = config.get('SMBServer', 'logpath')
    log_path = Path.cwd().parent / 'log' / 'MTBF-log'
    aee_program = 'aee_parse_linux' if platform.system().__eq__(
        'Linux') else 'aee_parse_win.exe'
    aee_path = Path.cwd().parent / 'aeeParse' / aee_program
    smb = SmbCommunicate(smb_user, smb_psw, smb_url, smb_port)
    parse = ParseLog(aee_path, log_path)
    try:
        print(start_time)
        parse.check_log(start_time, ":\\\\{url}\{shard}{dir}\\".format(
            url=smb_url, shard=smb_shard, dir=upload_path))
        print('Parse log succeed!')
        if len(parse.Exception_list) > 0:
            if create_bug == 'true':
                parse.create_issue(redmine_url, project_issue, assigned_to)
            if upload_log == 'true':
                for dir in parse.ParseDir_List:
                    parse.zip_and_upload(smb,
                        dir, smb_shard, upload_path, parse.Exception_list)
    except Exception:
        traceback.print_exc()
        print("Parse Fail!")
    finally:
        smb.disconnect()
    for _ in range(100):
        print('Process will exit after {} second!'.format(100 - _))
        sleep(1)
