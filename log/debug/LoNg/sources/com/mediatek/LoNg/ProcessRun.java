package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import com.mediatek.LoNg.utils.log.ParseLogFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class ProcessRun implements Runnable {
    private final String AEE_DBG_FILE = ".dbg";
    private final String AEE_EXP_TEMP = "/aee_exp/temp/";
    private final String DEBUGGERD_ZCORE_FILE = ".zip";
    private final int MINUTS = 60000;
    private final SimpleDateFormat MTBF_LOG_FOLDER_FORMATER = new SimpleDateFormat("yyyyMMdd_HHmmss");
    private final String NETLOG_SUFFIX_CAP = ".cap";
    private final ConfigDescriptor config;
    private ParseLogFile plf = null;
    private final String rootFolder;
    private boolean rootPrivilege = true;
    private String sn;

    public ProcessRun(String deviceSN, ConfigDescriptor config, String rootFolder) {
        this.sn = deviceSN;
        this.config = config;
        this.rootFolder = rootFolder;
        this.plf = new ParseLogFile();
    }

    public void run() {
        while (true) {
            long starttime = new Date().getTime();
            AdbOP.startMtkloggerAndDisableTaglog(this.sn);
            processOneDevice();
            long sleeptime = (starttime + ((long) (this.config.getSleep() * 60000))) - new Date().getTime();
            if (sleeptime > 0) {
                try {
                    Log.logger.info("Sleep " + (sleeptime / 1000) + "s");
                    Thread.sleep(sleeptime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void processOneDevice() {
        ArrayList<DeviceFileDetail> list = AdbOP.getAllLogList(this.sn, this.config);
        ArrayList<DeviceFileDetail> successList = new ArrayList();
        ArrayList<DeviceFileDetail> repeatList = new ArrayList();
        if (AdbOP.isRootShell(this.sn)) {
            this.rootPrivilege = true;
        } else {
            list = DataFolderCache.filterOutRepeatDataDBandCoredump(this.sn, list, repeatList);
            this.rootPrivilege = false;
        }
        if (isException(list)) {
            AdbOP.restartMtklogger(this.sn, this.config.isModemLogAlwaysOn());
            list = DataFolderCache.removeRepeatDB(AdbOP.getAllLogList(this.sn, this.config), repeatList);
        } else {
            AdbOP.startMtklogger(this.sn);
        }
        list = filterOutCurrentLoggingFolders(this.sn, list);
        String pcDeviceThisFolder = new StringBuilder(String.valueOf(this.rootFolder + "/" + this.sn + "/")).append("mtklog_").append(this.MTBF_LOG_FOLDER_FORMATER.format(new Date())).append("/").toString();
        new File(pcDeviceThisFolder).mkdirs();
        String zipPath = pcDeviceThisFolder.substring(0, pcDeviceThisFolder.length() - 1);
        if (list.size() > 0) {
            successList = renamePullRemove(this.sn, this.rootPrivilege, pcDeviceThisFolder, list);
        }
        if (isFileTypeExist(new File(pcDeviceThisFolder), ".cap") || isFileTypeExist(new File(pcDeviceThisFolder), ".cap.LoNg")) {
            zipPath = new StringBuilder(String.valueOf(zipPath)).append("_netlog").toString();
        }
        if (isFileTypeExist(new File(pcDeviceThisFolder), ".dbg")) {
            zipPath = new StringBuilder(String.valueOf(zipPath)).append("_exception").toString();
        } else {
            zipPath = new StringBuilder(String.valueOf(zipPath)).toString();
        }
        mtbfInfoTag(this.sn, successList, pcDeviceThisFolder, zipPath);
        zipAndDeleteLogFolder(zipPath, pcDeviceThisFolder);
    }

    private void mtbfInfoTag(String sn, ArrayList<DeviceFileDetail> list, String pcFolder, String zipPath) {
        if (new File(pcFolder).listFiles().length != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.plf.startParse(sn, new StringBuilder(String.valueOf(pcFolder)).append(((DeviceFileDetail) it.next()).getDeviceFilePath().toString()).toString().replace("//", "/"));
            }
            this.plf.write(sn, zipPath);
        }
    }

    private boolean isFileTypeExist(File path, String extName) {
        int i = 0;
        if (path == null || !path.isDirectory()) {
            Log.logger.error("path not exsit: " + path);
            return false;
        }
        File[] list = path.listFiles();
        if (list == null || list.length == 0) {
            return false;
        }
        int length = list.length;
        while (i < length) {
            File file = list[i];
            if (file.isDirectory()) {
                if (isFileTypeExist(file, extName)) {
                    return true;
                }
            } else if (!file.getAbsolutePath().endsWith(extName)) {
                continue;
            } else if (!extName.equals(".zip")) {
                return true;
            } else {
                if (extName.equals(".zip") && file.getAbsolutePath().replace("\\", "/").contains("/data/core/")) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    private void pcMoveFolder(String sourceFolder, String destPCFolder) {
        if (new File(sourceFolder).isDirectory()) {
            try {
                pcCopyDirectory(new File(sourceFolder), new File(destPCFolder));
                pcDeleteDirectory(new File(sourceFolder));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void pcCopyDirectory(File sourceLocation, File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }
            String[] children = sourceLocation.list();
            for (int i = 0; i < children.length; i++) {
                pcCopyDirectory(new File(sourceLocation, children[i]), new File(targetLocation, children[i]));
            }
            return;
        }
        InputStream in = new FileInputStream(sourceLocation);
        OutputStream out = new FileOutputStream(targetLocation);
        byte[] buf = new byte[1024];
        while (true) {
            int len = in.read(buf);
            if (len <= 0) {
                in.close();
                out.close();
                return;
            }
            out.write(buf, 0, len);
        }
    }

    public boolean pcDeleteDirectory(File directory) {
        if (directory.getAbsolutePath().length() < 5) {
            return false;
        }
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        pcDeleteDirectory(files[i]);
                    } else {
                        files[i].delete();
                    }
                }
            }
        }
        return directory.delete();
    }

    public void testPull(String sn, String pcPath, ArrayList<DeviceFileDetail> list) {
        AdbOP.testpull10Files(sn, pcPath, list);
    }

    public ArrayList<DeviceFileDetail> renamePullRemove(String sn, boolean root, String pcPath, ArrayList<DeviceFileDetail> list) {
        ArrayList<DeviceFileDetail> renamelist = renameLogFiles(sn, list);
        list = AdbOP.pullFiles(sn, pcPath, renamelist);
        AdbOP.removeFiles(sn, root, renamelist);
        return list;
    }

    private void zipAndDeleteLogFolder(String zipPath, String pcPath) {
        if (new File(pcPath).listFiles().length != 0) {
            //FileOpHelper.doZip(zipPath, pcPath);
            Log.logger.info("log dir: " + pcPath);
        } else {
            Log.logger.info("NO logs pulled out in this check !!!");
            Log.logger.info("delete dir: " + pcPath);
            FileOpHelper.deleteDirectory(new File(pcPath));
        }
        
    }

    private ArrayList<DeviceFileDetail> filterOutCurrentLoggingFolders(String sn, ArrayList<DeviceFileDetail> list) {
        HashSet<String> filterSet = getCurrentLoggingFolderSet(sn, list);
        ArrayList<DeviceFileDetail> newList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceFileDetail deviceFile = (DeviceFileDetail) it.next();
            if (!deviceFile.getFilename().endsWith("file_tree.txt")) {
                String folder = deviceFile.getDeviceFolder();
                if (!folder.contains("/aee_exp/temp/") && ((!folder.contains("mdlog") || this.config.isPullModemLog()) && !(folder.contains("/data/core/") && deviceFile.getFilename().endsWith(".tmp")))) {
                    if (!filterSet.contains(folder)) {
                        newList.add(deviceFile);
                    } else if (folder.contains("/mtklog/mobilelog/")) {
                        if (!(deviceFile.getFilename().endsWith(".curf") || deviceFile.getFilename().endsWith("_log") || !deviceFile.getFilename().contains("_log"))) {
                            newList.add(deviceFile);
                        }
                    } else if (folder.contains("/mtklog/netlog/")) {
                        if (deviceFile.getFilename().contains(".tmp") || deviceFile.getFilename().endsWith(".txt")) {
                            Log.logger.info("current netlog: " + deviceFile.getDeviceFilePath().toString());
                        } else {
                            newList.add(deviceFile);
                        }
                    } else if (folder.contains("/mtklog/mdlog/")) {
                        if (deviceFile.getFilename().endsWith(".dmp.dmp") || deviceFile.getFilename().endsWith(".bin.bin") || deviceFile.getFilename().endsWith(".txt")) {
                            Log.logger.info("current mdlog: " + deviceFile.getDeviceFilePath().toString());
                        } else {
                            newList.add(deviceFile);
                        }
                    } else if (folder.contains("/mtklog/mdlog1/")) {
                        if (deviceFile.getFilename().endsWith(".tmp") || deviceFile.getFilename().endsWith(".txt")) {
                            Log.logger.info("current mdlog1: " + deviceFile.getDeviceFilePath().toString());
                        } else {
                            newList.add(deviceFile);
                        }
                    } else if (folder.contains("/mtklog/mdlog3/")) {
                        if (deviceFile.getFilename().endsWith(".tmp") || deviceFile.getFilename().endsWith(".txt")) {
                            Log.logger.info("current mdlog3: " + deviceFile.getDeviceFilePath().toString());
                        } else {
                            newList.add(deviceFile);
                        }
                    } else if (!folder.contains("/data/mdlog/bootupLog/")) {
                        Log.logger.info("current log: " + deviceFile.getDeviceFilePath().toString());
                    } else if (deviceFile.getFilename().endsWith(".tmp") || deviceFile.getFilename().endsWith(".txt")) {
                        Log.logger.info("current bootupLog: " + deviceFile.getDeviceFilePath().toString());
                    } else {
                        newList.add(deviceFile);
                    }
                }
            }
        }
        return newList;
    }

    private HashSet<String> getCurrentLoggingFolderSet(String sn, ArrayList<DeviceFileDetail> list) {
        String currentMobilelogFolder = "";
        long currentMobilelogTime = Long.MAX_VALUE;
        String currentNetlogFolder = "";
        long currentNetlogTime = Long.MAX_VALUE;
        String currentModemlogFolder = "";
        long currentModemlogTime = Long.MAX_VALUE;
        String currentModemlog_1_Folder = "";
        long currentModemlog_1_Time = Long.MAX_VALUE;
        String currentModemlog_3_Folder = "";
        long currentModemlog_3_Time = Long.MAX_VALUE;
        String currentBootUpModemlogFolder = "";
        long currentBootUpModemlogTime = Long.MAX_VALUE;
        long deviceNow = AdbOP.getDeviceTime(sn);
        if (deviceNow <= 0) {
            deviceNow = Long.MAX_VALUE;
            Log.logger.warn("devices now: can not get device time!!");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceFileDetail deviceFile = (DeviceFileDetail) it.next();
            long timeToNow = deviceNow - deviceFile.getTime();
            if (timeToNow < 0) {
                Log.logger.warn("skip file! modify in future: " + deviceFile.getDeviceFilePath().toString() + " ll: " + deviceFile.getRaw() + " devices now: " + new Date(deviceNow).toLocaleString());
            } else if (deviceFile.getDeviceFolder().endsWith("/mtklog/mobilelog/") || deviceFile.getDeviceFolder().endsWith("/mtklog/mdlog/") || deviceFile.getDeviceFolder().endsWith("/mtklog/mdlog1/") || deviceFile.getDeviceFolder().endsWith("/mtklog/mdlog3/") || deviceFile.getDeviceFolder().endsWith("/mtklog/netlog/") || deviceFile.getDeviceFolder().endsWith("/data/mdlog/bootupLog/")) {
                Log.logger.warn("skip root folder: " + deviceFile.getDeviceFolder());
            } else if (deviceFile.getDeviceFolder().contains("/mtklog/mobilelog/")) {
                if (timeToNow < currentMobilelogTime) {
                    currentMobilelogTime = timeToNow;
                    currentMobilelogFolder = deviceFile.getDeviceFolder();
                }
            } else if (deviceFile.getDeviceFolder().contains("/mtklog/netlog/")) {
                if (timeToNow < currentNetlogTime) {
                    currentNetlogTime = timeToNow;
                    currentNetlogFolder = deviceFile.getDeviceFolder();
                }
            } else if (deviceFile.getDeviceFolder().contains("/mtklog/mdlog/")) {
                if (timeToNow < currentModemlogTime) {
                    currentModemlogTime = timeToNow;
                    currentModemlogFolder = deviceFile.getDeviceFolder();
                }
            } else if (deviceFile.getDeviceFolder().contains("/mtklog/mdlog1/")) {
                if (timeToNow < currentModemlog_1_Time) {
                    currentModemlog_1_Time = timeToNow;
                    currentModemlog_1_Folder = deviceFile.getDeviceFolder();
                }
            } else if (deviceFile.getDeviceFolder().contains("/mtklog/mdlog3/")) {
                if (timeToNow < currentModemlog_3_Time) {
                    currentModemlog_3_Time = timeToNow;
                    currentModemlog_3_Folder = deviceFile.getDeviceFolder();
                }
            } else if (deviceFile.getDeviceFolder().contains("/data/mdlog/bootupLog/") && timeToNow < currentBootUpModemlogTime) {
                currentBootUpModemlogTime = timeToNow;
                currentBootUpModemlogFolder = deviceFile.getDeviceFolder();
            }
        }
        HashSet<String> filterSet = new HashSet();
        if (currentMobilelogFolder.length() > 0) {
            filterSet.add(currentMobilelogFolder);
            Log.logger.info("skip currentMobilelogFolder: " + currentMobilelogFolder);
        }
        if (currentNetlogFolder.length() > 0) {
            filterSet.add(currentNetlogFolder);
            Log.logger.info("skip currentNetlogFolder: " + currentNetlogFolder);
        }
        if (currentModemlogFolder.length() > 0) {
            filterSet.add(currentModemlogFolder);
            Log.logger.info("skip currentModemlogFolder: " + currentModemlogFolder);
        }
        if (currentModemlog_1_Folder.length() > 0) {
            filterSet.add(currentModemlog_1_Folder);
            Log.logger.info("skip currentModemlog_1_Folder: " + currentModemlog_1_Folder);
        }
        if (currentModemlog_3_Folder.length() > 0) {
            filterSet.add(currentModemlog_3_Folder);
            Log.logger.info("skip currentModemlog_3_Folder: " + currentModemlog_3_Folder);
        }
        if (currentBootUpModemlogFolder.length() > 0) {
            filterSet.add(currentBootUpModemlogFolder);
            Log.logger.info("skip currentBootUpModemlogFolder: " + currentBootUpModemlogFolder);
        }
        return filterSet;
    }

    private ArrayList<DeviceFileDetail> renameLogFiles(String sn, ArrayList<DeviceFileDetail> list) {
        ArrayList<DeviceFileDetail> newList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceFileDetail deviceFile = (DeviceFileDetail) it.next();
            String oldName = deviceFile.getFilename();
            String folderPath = deviceFile.getDeviceFolder();
            String newName = oldName;
            String repeatStr="";
            int index;
            if (deviceFile.getFilename().endsWith(".dbg")) {
                index = DevicesFileIdexManager.getNextIndexOfPC(sn, deviceFile.getDeviceFilePath());
                if (index != 20) {
                    newName = new StringBuilder(String.valueOf(oldName)).append(".").append(index).append(".dbg").toString();
                }
            } else if (folderPath.contains("netlog") && deviceFile.getFilename().contains("_V2_")) {
                newName = new StringBuilder(String.valueOf(oldName)).append(".LoNg").toString();
            } else if (deviceFile.getFilename().endsWith("1.cap") || deviceFile.getFilename().endsWith("2.cap") || deviceFile.getFilename().endsWith("3.cap") || deviceFile.getFilename().endsWith("4.cap")) {
                repeatStr = oldName.substring(0, oldName.length() - 5) + ".cap";
                newName = new StringBuilder(String.valueOf(repeatStr)).append(DevicesFileIdexManager.getNextIndexOfPC(sn, new DeviceFilePath(deviceFile.getDeviceFolder(), repeatStr))).append(".cap").toString();
            } else if (folderPath.contains("mobilelog") && deviceFile.getFilename().contains("_log_")) {
                newName = new StringBuilder(String.valueOf(oldName)).append(".LoNg").toString();
            } else if (oldName.endsWith(".1") || oldName.endsWith(".2") || oldName.endsWith(".3") || oldName.endsWith(".4")) {
                repeatStr = oldName.substring(0, oldName.length() - 2);
                newName = new StringBuilder(String.valueOf(repeatStr)).append(".").append(DevicesFileIdexManager.getNextIndexOfPC(sn, new DeviceFilePath(deviceFile.getDeviceFolder(), repeatStr))).toString();
            } else if (oldName.endsWith("main_log") || oldName.endsWith("radio_log") || oldName.endsWith("kernel_log") || oldName.endsWith("events_log")) {
                index = DevicesFileIdexManager.getNextIndexOfPC(sn, deviceFile.getDeviceFilePath());
                if (index != 20) {
                    newName = new StringBuilder(String.valueOf(oldName)).append(".").append(index).toString();
                }
            } else if (deviceFile.getFilename().contains("_V2_") && oldName.endsWith(".cap")) {
                index = DevicesFileIdexManager.getNextIndexOfPC(sn, deviceFile.getDeviceFilePath());
                if (index != 20) {
                    newName = oldName.replace(".cap", new StringBuilder(String.valueOf(index)).append(".cap").toString());
                }
            } else {
                index = DevicesFileIdexManager.getNextIndexOfPC(sn, deviceFile.getDeviceFilePath());
                if (index != 20) {
                    String suffix = getSuffix(deviceFile.getFilename());
                    if (suffix.length() > 10) {
                        suffix = ".long_suffix";
                    }
                    newName = new StringBuilder(String.valueOf(oldName)).append(".").append(index).append(suffix).toString();
                }
            }
            if (newName.compareTo(oldName) == 0) {
                newList.add(deviceFile);
            } else if (AdbOP.renameTargetFile(sn, deviceFile, newName)) {
                newList.add(new DeviceFileDetail(deviceFile.getDeviceFolder(), newName, deviceFile.getModifyTime(), deviceFile.getTime(), deviceFile.getFileSize(), "rename files"));
            } else {
                newList.add(deviceFile);
            }
        }
        return newList;
    }

    private String getSuffix(String name) {
        String suffix = "";
        int index = name.lastIndexOf(".");
        if (index != -1) {
            return name.substring(index, name.length());
        }
        return suffix;
    }

    private boolean isException(ArrayList<DeviceFileDetail> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceFileDetail deviceFile = (DeviceFileDetail) it.next();
            if (deviceFile.getFilename().endsWith(".dbg") && !deviceFile.getDeviceFolder().contains("/aee_exp/temp/")) {
                Log.logger.info("found .dbg file: " + deviceFile.getDeviceFilePath());
                return true;
            } else if (deviceFile.getFilename().endsWith(".zip") && deviceFile.getDeviceFolder().contains("/data/core/")) {
                Log.logger.info("found zcore-debuggerd-xxx file: " + deviceFile.getDeviceFilePath());
                return true;
            }
        }
        return false;
    }
}
