package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdbOP {
    static final Pattern pLSTime = Pattern.compile(".* (\\d+) (\\d\\d\\d\\d-\\d\\d-\\d\\d \\d\\d:\\d\\d) (.*)");
    static final SimpleDateFormat shellDateFormatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");

    static boolean restartMtklogger(String sn, boolean modemLogAlwaysOn) {
        Log.logger.info("restart mtklogger SN: " + sn);
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("am");
        command.add("broadcast");
        command.add("-a");
        command.add("com.mediatek.mtklogger.ADB_CMD");
        command.add("-e");
        command.add("cmd_name");
        command.add("stop");
        command.add("--ei");
        command.add("cmd_target");
        if (modemLogAlwaysOn) {
            command.add("5");
        } else {
            command.add("7");
        }
        command.add("-f");
        command.add("0x04000000");
        ArrayList<String> adbResult = AdbAdapter.ExecuteSN(sn, command);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        startMtklogger(sn);
        return false;
    }

    public static void startMtklogger(String sn) {
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("am");
        command.add("broadcast");
        command.add("-a");
        command.add("com.mediatek.mtklogger.ADB_CMD");
        command.add("-e");
        command.add("cmd_name");
        command.add("start");
        command.add("--ei");
        command.add("cmd_target");
        command.add("7");
        command.add("-f");
        command.add("0x04000000");
        ArrayList<String> adbResult = AdbAdapter.ExecuteSN(sn, command);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static HashSet<String> getOnlineDevices() {
        ArrayList<String> command = new ArrayList();
        command.add("devices");
        ArrayList<String> adbResult = AdbAdapter.Execute(command);
        HashSet<String> devices = new HashSet();
        Iterator it = adbResult.iterator();
        while (it.hasNext()) {
            String string = (String) it.next();
            String STR_DEVICE = "\tdevice";
            String STR_DEVICE_OFFLINE = "offline";
            String sn;
            if (string.endsWith("\tdevice")) {
                sn = string.replace("\tdevice", "").trim();
                if (sn.length() > 1) {
                    Log.logger.info("device SN: " + sn);
                    devices.add(sn);
                }
            } else if (string.endsWith("offline")) {
                sn = string.replace("offline", "").trim();
                if (sn.length() > 1) {
                    Log.logger.warn("device offline: " + sn);
                }
            }
        }
        return devices;
    }

    static boolean startMtkloggerAndDisableTaglog(String sn) {
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("am");
        command.add("broadcast");
        command.add("-a");
        command.add("com.mediatek.mtklogger.ADB_CMD");
        command.add("-e");
        command.add("cmd_name");
        command.add("switch_taglog");
        command.add("--ei");
        command.add("cmd_target");
        command.add("0");
        command.add("-f");
        command.add("0x04000000");
        ArrayList<String> adbResult = AdbAdapter.ExecuteSN(sn, command);
        return false;
    }

    static ArrayList<DeviceFileDetail> pullFiles(String sn, String pcPath, ArrayList<DeviceFileDetail> list) {
        ArrayList<DeviceFileDetail> sucessList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceFileDetail deviceFileDetail = (DeviceFileDetail) it.next();
            String pcFolder = new StringBuilder(String.valueOf(pcPath)).append(deviceFileDetail.getDeviceFolder()).toString().replaceAll("//", "/");
            new File(pcFolder).mkdirs();
            String pcTargetFile = new StringBuilder(String.valueOf(pcFolder)).append(deviceFileDetail.getFilename()).toString();
            ArrayList<String> command = new ArrayList();
            command.add("pull");
            command.add(deviceFileDetail.getDeviceFilePath().toString());
            command.add(pcTargetFile);
            ArrayList<String> adbResult = new ArrayList();
            boolean isEqual = false;
            int again = 0;
            while (!isEqual && again < 2) {
                adbResult = AdbAdapter.ExecuteSN(sn, command);
                File pcFile = new File(pcTargetFile);
                isEqual = (pcFile.exists() && pcFile.isFile()) ? deviceFileDetail.getFileSize() == pcFile.length() : false;
                if (isEqual) {
                    sucessList.add(deviceFileDetail);
                } else {
                    Log.logger.warn("File: " + deviceFileDetail.getFilename() + " file_size: " + deviceFileDetail.getFileSize() + " pulled_size: " + pcFile.length());
                    Iterator it2 = adbResult.iterator();
                    while (it2.hasNext()) {
                        Log.logger.warn("Size not equal ! sn: " + sn + " " + ((String) it2.next()));
                    }
                }
                again++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        return sucessList;
    }

    static void testpull10Files(String sn, String pcPath, ArrayList<DeviceFileDetail> list) {
        int i = 10;
        while (i < list.size() && i < 20) {
            DeviceFileDetail deviceFileDetail = (DeviceFileDetail) list.get(i);
            String pcFolder = new StringBuilder(String.valueOf(pcPath)).append(deviceFileDetail.getDeviceFolder()).toString();
            new File(pcFolder).mkdirs();
            ArrayList<String> command = new ArrayList();
            command.add("pull");
            command.add(deviceFileDetail.getDeviceFilePath().toString());
            command.add(new StringBuilder(String.valueOf(pcFolder)).append("/").append(deviceFileDetail.getFilename()).toString());
            AdbAdapter.ExecuteSN(sn, command);
            i++;
        }
    }

    public static ArrayList<DeviceFileDetail> getAllLogList(String sn, ConfigDescriptor config) {
        return sortLogFiles(lsAll(sn, config));
    }

    private static ArrayList<DeviceFileDetail> sortLogFiles(ArrayList<DeviceFileDetail> list) {
        Collections.sort(list, new Comparator<DeviceFileDetail>() {
            public int compare(DeviceFileDetail o1, DeviceFileDetail o2) {
                return (o2.getDeviceFolder() + o2.getFilename()).compareTo(o1.getDeviceFolder() + o1.getFilename());
            }
        });
        return list;
    }

    static long getDeviceTime(String sn) {
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("date");
        command.add("+%Y-%m-%d-%H:%M:%S");
        Iterator it = AdbAdapter.ExecuteSN(sn, command).iterator();
        while (it.hasNext()) {
            try {
                Log.logger.fatal("Get device time success!");
                Log.logger.fatal(it.toString());
                return shellDateFormatter.parse((String) it.next()).getTime();
            } catch (ParseException e) {
            }
        }
        return -1;
    }

    private static ArrayList<DeviceFileDetail> lsAll(String sn, ConfigDescriptor config) {
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("ls");
        command.add("-R");
        command.add("-l");
        Iterator it = config.getLogPath().iterator();
        while (it.hasNext()) {
            command.add((String) it.next());
        }
        ArrayList<String> adbResult = AdbAdapter.ExecuteSN(sn, command);
        String currentDir = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        ArrayList<DeviceFileDetail> allFiles = new ArrayList();
        Iterator it2 = adbResult.iterator();
        while (it2.hasNext()) {
            String line = (String) it2.next();
            if (line.startsWith("/")) {
                it = config.getLogPath().iterator();
                while (it.hasNext()) {
                    if (line.startsWith((String) it.next())) {
                        currentDir = line.replace("//", "/").replace(":", "");
                        if (!currentDir.endsWith("/")) {
                            currentDir = new StringBuilder(String.valueOf(currentDir)).append("/").toString();
                        }
                    }
                }
            } else if (line.startsWith("-")) {
                Matcher m = pLSTime.matcher(line);
                if (m.matches()) {
                    long size = Long.parseLong(m.group(1));
                    String modifyTime = m.group(2);
                    try {
                        allFiles.add(new DeviceFileDetail(currentDir, m.group(3).trim(), modifyTime, simpleDateFormat.parse(modifyTime).getTime(), size, line));
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("modifyTime:  " + modifyTime);
                        Log.logger.fatal("date format changed!!");
                    }
                } else {
                    Log.logger.fatal("shell ls -l format unkown!!");
                }
            } else {
                line.startsWith("d");
            }
        }
        return allFiles;
    }

    public static boolean renameTargetFile(String sn, DeviceFileDetail deviceFile, String newName) {
        String oldName = (deviceFile.getDeviceFolder() + "/" + deviceFile.getFilename()).replaceAll("//", "/");
        newName = (deviceFile.getDeviceFolder() + "/" + newName).replaceAll("//", "/");
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("mv");
        command.add(oldName);
        command.add(newName);
        Iterator it = AdbAdapter.ExecuteSN(sn, command).iterator();
        while (it.hasNext()) {
            String string = (String) it.next();
            if (string.startsWith("failed")) {
                Log.logger.warn("sn: " + sn + " " + string);
                return false;
            }
        }
        return true;
    }

    static boolean removeFiles(String sn, boolean root, ArrayList<DeviceFileDetail> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String filePath = ((DeviceFileDetail) it.next()).getDeviceFilePath().toString();
            if (root || !filePath.startsWith("/data/")) {
                ArrayList<String> command = new ArrayList();
                command.add("shell");
                command.add("rm");
                command.add(filePath);
                Iterator it2 = AdbAdapter.ExecuteSN(sn, command).iterator();
                while (it2.hasNext()) {
                    String string = (String) it2.next();
                    if (string.startsWith("rm failed")) {
                        Log.logger.warn("sn: " + sn + " " + string);
                    }
                }
            } else {
                Log.logger.info("Shell cmd will not rm ReadOnly file: " + filePath);
            }
        }
        return true;
    }

    static boolean isRootShell(String sn) {
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("id");
        Iterator it = AdbAdapter.ExecuteSN(sn, command).iterator();
        while (it.hasNext()) {
            if (((String) it.next()).contains("root")) {
                return true;
            }
        }
        return false;
    }

    static String shellCatFile(String sn, String file) {
        ArrayList<String> command = new ArrayList();
        command.add("shell");
        command.add("cat");
        command.add(file);
        String result = "";
        Iterator it = AdbAdapter.ExecuteSN(sn, command).iterator();
        while (it.hasNext()) {
            result = new StringBuilder(String.valueOf(result)).append((String) it.next()).toString();
        }
        return result;
    }
}
