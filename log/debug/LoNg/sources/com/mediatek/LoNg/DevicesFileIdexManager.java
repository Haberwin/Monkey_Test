package com.mediatek.LoNg;

import java.util.HashMap;

public class DevicesFileIdexManager {
    public static final int START_INDEX = 20;
    private static HashMap<String, HashMap<String, Integer>> allDevices = new HashMap();

    public static synchronized int getNextIndexOfPC(String sn, DeviceFilePath DevicePath) {
        int i = 20;
        synchronized (DevicesFileIdexManager.class) {
            String fullPath = DevicePath.toString();
            HashMap<String, Integer> devices = (HashMap) allDevices.get(sn);
            if (devices != null) {
                Integer index = (Integer) devices.get(fullPath);
                if (index == null) {
                    devices.put(fullPath, new Integer(20));
                } else {
                    devices.put(fullPath, Integer.valueOf(index.intValue() + 1));
                    i = ((Integer) devices.get(fullPath)).intValue();
                }
            } else {
                HashMap<String, Integer> logItem = new HashMap();
                logItem.put(fullPath, new Integer(20));
                allDevices.put(sn, logItem);
            }
        }
        return i;
    }
}
