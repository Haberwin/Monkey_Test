package com.mediatek.LoNg;

public class DeviceFilePath {
    public String deviceFolder;
    public String filename;

    public DeviceFilePath(String deviceFolder, String filename) {
        this.deviceFolder = deviceFolder;
        this.filename = filename;
    }

    public String toString() {
        return this.deviceFolder + this.filename;
    }
}
