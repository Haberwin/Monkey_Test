package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Configuration {
    private final String CONFIG_ERROR = "Config error: ";
    private final String CONFIG_INI = "LoNg.ini";
    private final String LOGPATH = "logpath=";
    private final String PULL_MODEM_LOG = "pull_modem_log=";
    private final String SLEEP = "sleep=";

    public ConfigDescriptor getConfig() {
        ConfigDescriptor config = new ConfigDescriptor();
        String[] lines = new String[0];
        try {
            FileReader fread = new FileReader("LoNg.ini");
            BufferedReader br = new BufferedReader(fread);
            ArrayList<String> list = new ArrayList();
            while (br.ready()) {
                list.add(br.readLine());
            }
            lines = new String[list.size()];
            list.toArray(lines);
            fread.close();
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].startsWith("sleep=")) {
                    String strSleepTime = lines[i].replace("sleep=", "").trim();
                    if (strSleepTime.length() > 0) {
                        int sleep = Integer.parseInt(strSleepTime);
                        if (sleep < 5 || sleep > 60) {
                            Log.logger.fatal("Config error: sleep time out of range. default sleep 5 minus.");
                        } else {
                            config.setSleep(sleep);
                        }
                    }
                }
                if (lines[i].startsWith("logpath=")) {
                    String strLogPath = lines[i].replace("logpath=", "").trim();
                    if (strLogPath.length() > 0) {
                        for (String path : strLogPath.split(",")) {
                            String trim = path.trim();
                            if (trim.length() > 3) {
                                config.addLogPath(trim);
                            }
                        }
                    }
                }
                if (lines[i].startsWith("pull_modem_log=")) {
                    String pullModemLog = lines[i].replace("pull_modem_log=", "").trim();
                    if (pullModemLog.length() > 0 && (pullModemLog.equals("true") || pullModemLog.equals("false"))) {
                        config.setPullModemLog(pullModemLog.equals("true"));
                    }
                }
            }
            Log.logger.info(config);
        } catch (FileNotFoundException e) {
            Log.logger.fatal("Config error: File Not Found: LoNg.ini");
        } catch (IOException e2) {
            Log.logger.fatal("Config error: IOException: LoNg.ini");
        }
        return config;
    }
}
