package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DataFolderCache {
    private static final String ZZ_INTERNAL = "ZZ_INTERNAL";
    private static HashSet<String> dataFiles = new HashSet();

    static synchronized ArrayList<DeviceFileDetail> filterOutRepeatDataDBandCoredump(String sn, ArrayList<DeviceFileDetail> list, ArrayList<DeviceFileDetail> repeatList) {
        ArrayList<DeviceFileDetail> newList;
        synchronized (DataFolderCache.class) {
            newList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceFileDetail deviceFile = (DeviceFileDetail) it.next();
                if (deviceFile.getDeviceFolder().startsWith("/data/")) {
                    String fileKey = "sn:" + sn + " path:" + deviceFile.getDeviceFilePath().toString() + " raw:" + deviceFile.getRaw();
                    if (dataFiles.contains(fileKey)) {
                        repeatList.add(deviceFile);
                        Log.logger.info("filter out repeat data file. " + fileKey);
                    } else {
                        dataFiles.add(fileKey);
                        newList.add(deviceFile);
                    }
                } else {
                    newList.add(deviceFile);
                }
            }
        }
        return newList;
    }

    static ArrayList<DeviceFileDetail> removeRepeatDB(ArrayList<DeviceFileDetail> list, ArrayList<DeviceFileDetail> removeList) {
        if (removeList.size() == 0) {
            return list;
        }
        ArrayList<DeviceFileDetail> finalList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceFileDetail item = (DeviceFileDetail) it.next();
            boolean keep = true;
            Iterator it2 = removeList.iterator();
            while (it2.hasNext()) {
                if (item.getDeviceFilePath().toString().compareTo(((DeviceFileDetail) it2.next()).getDeviceFilePath().toString()) == 0) {
                    keep = false;
                    break;
                }
            }
            if (keep) {
                finalList.add(item);
            } else {
                Log.logger.info("Ignore repeat db. " + item.getDeviceFilePath().toString());
            }
        }
        return finalList;
    }
}
