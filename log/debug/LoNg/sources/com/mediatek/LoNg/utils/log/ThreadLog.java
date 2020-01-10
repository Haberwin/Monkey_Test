package com.mediatek.LoNg.utils.log;

import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class ThreadLog {
    private Logger logger = null;
    private RollingFileAppender rollFileAppender = null;

    public ThreadLog(String sn) {
        String str = "thread-" + sn;
        this.logger = Logger.getLogger(str);
        try {
            this.rollFileAppender = new RollingFileAppender(new PatternLayout("[%d{ISO8601}] (%t)(%F): %m%n"), "KT-log/" + str + "-kt.log", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.rollFileAppender.setThreshold(Level.DEBUG);
        this.rollFileAppender.setMaxFileSize("500000KB");
        this.rollFileAppender.setMaxBackupIndex(1);
        this.rollFileAppender.activateOptions();
        this.logger.setLevel(Level.DEBUG);
        this.logger.addAppender(this.rollFileAppender);
    }

    public Logger getLogger() {
        return this.logger;
    }
}
