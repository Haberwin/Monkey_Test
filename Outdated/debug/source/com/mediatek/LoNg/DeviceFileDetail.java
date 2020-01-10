package com.mediatek.LoNg;

public class DeviceFileDetail {
    private DeviceFilePath path;
    private String raw;
    private long size;
    private String strTime;
    private long time;

    public DeviceFileDetail(String deviceFolder, String filename, String modifyTime, long time, long size, String raw) {
        this.path = new DeviceFilePath(deviceFolder, filename);
        this.strTime = modifyTime;
        this.time = time;
        this.size = size;
        this.raw = raw;
    }

    public void setData(DeviceFilePath data) {
        this.path = data;
    }

    public DeviceFilePath getDeviceFilePath() {
        return this.path;
    }

    public String getDeviceFolder() {
        return this.path.deviceFolder;
    }

    public String getFilename() {
        return this.path.filename;
    }

    public String getModifyTime() {
        return this.strTime;
    }

    public long getTime() {
        return this.time;
    }

    public long getFileSize() {
        return this.size;
    }

    public String getRaw() {
        return this.raw;
    }

    public String showDeviceFileDetial() {
        return "FileDetail: " + this.path + " " + this.strTime + " " + this.time + " " + this.size + " " + this.raw;
    }
}
