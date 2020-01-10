package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    private static final String MTBF_LOG_FOLDER = "MTBF-log";
    private static final SimpleDateFormat MTBF_LOG_FOLDER_FORMATER = new SimpleDateFormat("yyyyMMdd_HHmmss");
    private static final String VERISON = "v2.1710.5";
    private static final ConfigDescriptor config = new Configuration().getConfig();
    private static final String rootFolder = new StringBuilder(String.valueOf(config.getPcStoragePath())).append("/").append(MTBF_LOG_FOLDER).append("/").append(MTBF_LOG_FOLDER_FORMATER.format(new Date())).toString();

    public static void main(String[] args) {
        if (args.length != 0) {
            if (args.length < 1 || args[0].compareTo("start") == 0) {
                Log.logger.info("LoNg version: v2.1710.5");
                new File(rootFolder).mkdirs();
                ThreadGroup t_group = new ThreadGroup("main thread_group");
                while (true) {
                    Thread[] threads = new Thread[t_group.activeCount()];
                    t_group.enumerate(threads, false);
                    HashSet<String> td_devices = new HashSet();
                    for (Thread td : threads) {
                        td_devices.add(td.getName());
                    }
                    HashSet<String> devices = AdbOP.getOnlineDevices();
                    for (Thread td2 : threads) {
                        Log.logger.info("current thread:" + td2.getName() + td2.getId());
                    }
                    Iterator it = devices.iterator();
                    while (it.hasNext()) {
                        String sn = (String) it.next();
                        if (!td_devices.contains("thread_" + sn)) {
                            new Thread(t_group, new ProcessRun(sn, config, rootFolder), "thread_" + sn).start();
                        }
                    }
                    if (devices.size() == 0) {
                        Log.logger.info("No devices!!!");
                    }
                    try {
                        Thread.sleep(360000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
