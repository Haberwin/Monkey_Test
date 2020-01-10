package com.mediatek.LoNg;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

public class ConfigDescriptor {
    private HashSet<String> logPath = new HashSet();
    private boolean modemLogAlwaysOn = false;
    private String pcStoragePath = new File("").getAbsolutePath();
    private boolean pullModemLog = true;
    private int sleep = 5;

    public boolean isModemLogAlwaysOn() {
        return this.modemLogAlwaysOn;
    }

    public void setModemLogAlwaysOn(boolean modemLogUSBMode) {
        this.modemLogAlwaysOn = modemLogUSBMode;
    }

    public int getSleep() {
        return this.sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public void setPullModemLog(boolean pullModemLog) {
        this.pullModemLog = pullModemLog;
    }

    public boolean isPullModemLog() {
        return this.pullModemLog;
    }

    public void addLogPath(String path) {
        this.logPath.add(path);
    }

    public String getPcStoragePath() {
        return this.pcStoragePath;
    }

    public HashSet<String> getLogPath() {
        HashSet<String> fixedPath = new HashSet();
        Iterator it = this.logPath.iterator();
        while (it.hasNext()) {
            String path = (String) it.next();
            if (path.endsWith("/")) {
                fixedPath.add(path);
            } else {
                fixedPath.add(new StringBuilder(String.valueOf(path)).append("/").toString());
            }
        }
        return fixedPath;
    }

    ConfigDescriptor() {
        this.logPath.add("/mnt/sdcard/mtklog/");
        this.logPath.add("/mnt/sdcard0/mtklog/");
        this.logPath.add("/mnt/sdcard1/mtklog/");
        this.logPath.add("/mnt/sdcard2/mtklog/");
        this.logPath.add("/mnt/m_external_sd/mtklog");
        this.logPath.add("/data/aee_exp/");
        this.logPath.add("/data/tombstones/");
        this.logPath.add("/data/core/");
        this.logPath.add("/data/mdlog/bootupLog/");
    }

    public String toString() {
        String path = "";
        Iterator it = this.logPath.iterator();
        while (it.hasNext()) {
            path = new StringBuilder(String.valueOf(path)).append((String) it.next()).append(",").toString();
        }
        return "ConfigDescriptor [sleep=" + this.sleep + ", logPath=" + path + ", pcStoragePath=" + this.pcStoragePath + ", pull_modem_log=" + this.pullModemLog + "]";
    }
}
