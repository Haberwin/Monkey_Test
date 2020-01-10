package com.mediatek.LoNg.utils.log;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
    private static final String KTLOG = "KT-log/";
    public static Logger logger;

    static {
        logger = null;
        String filePath = "KT-log/kt.log";
        if (!new File(KTLOG).exists()) {
            new File(KTLOG).mkdirs();
        }
        File ktlog = new File(filePath);
        if (ktlog.exists()) {
            File ktlog_bak = new File("KT-log/kt.log_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
            if (ktlog.renameTo(ktlog_bak)) {
                System.out.println("rename kt.log to " + ktlog_bak);
            }
        }
        if (logger == null) {
            PropertyConfigurator.configure(LogManager.DEFAULT_CONFIGURATION_FILE);
            logger = LogManager.getLogger("");
        }
    }

    public static void DEBUG(String msg) {
    }
}
