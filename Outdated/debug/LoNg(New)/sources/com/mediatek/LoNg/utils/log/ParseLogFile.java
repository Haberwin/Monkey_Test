package com.mediatek.LoNg.utils.log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseLogFile {
    private static Pattern ptnAndroidLog = Pattern.compile("(^\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d+) .*");
    private static Pattern ptnKernelLog = Pattern.compile("\\<\\d{1,2}\\>\\[ *(\\d+\\.\\d+)\\].*");
    private static Pattern ptnName = Pattern.compile(".*\\/([\\(\\)a-zA-Z0-9_.-]*)");
    private String currentZipPath = null;
    private ArrayList<String> zipedFiles = new ArrayList();
    private ArrayList<String> zz_internalFileList = new ArrayList();
    private HashMap<String, ArrayList<String>> zz_internalFileMap = new HashMap();

    public void startParse(String sn, String logFile) {
        ArrayList<String> zz_internalContent = new ArrayList();
        int i = 20;
        int hit = 0;
        String finalLogFile = logFile;
        Matcher m = ptnName.matcher(logFile);
        if (m.matches()) {
            Log.DEBUG("logfile hit");
            finalLogFile = m.group(1);
        }
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(logFile)));
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                String line = br.readLine();
                if (line == null) {
                    break;
                } else if (finalLogFile.indexOf("ZZ_INTERNAL") >= 0) {
                    zz_internalContent.add(line);
                } else if (logFile.contains("/mobilelog/")) {
                    if (finalLogFile.indexOf("kernel_log") >= 0) {
                        m = ptnKernelLog.matcher(line);
                        if (!m.matches()) {
                            m = ptnAndroidLog.matcher(line);
                        }
                    } else {
                        m = ptnAndroidLog.matcher(line);
                    }
                    if (m.matches()) {
                        hit = 1;
                        this.zipedFiles.add("  -- " + sn + "; " + finalLogFile + ";\tstartTime: " + m.group(1) + 10);
                        break;
                    }
                } else {
                    continue;
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (finalLogFile.indexOf("ZZ_INTERNAL") >= 0) {
            this.zz_internalFileList.add(logFile);
            this.zz_internalFileMap.put(logFile, zz_internalContent);
        }
        if (hit == 0) {
            Log.DEBUG("nothing write to the file 'ZipFileMap'");
        }
    }

    public synchronized void write(String sn, String zipPath) {
        Iterator it;
        String currentZipName = null;
        if (!zipPath.equals(this.currentZipPath)) {
            this.currentZipPath = zipPath;
        }
        Matcher m = ptnName.matcher(this.currentZipPath);
        if (m.matches()) {
            currentZipName = m.group(1);
        }
        Iterator it2 = this.zz_internalFileList.iterator();
        while (it2.hasNext()) {
            String s = (String) it2.next();
            FileWrite.write("DBFileMap", new StringBuilder(String.valueOf(s)).append("  ").toString());
            it = ((ArrayList) this.zz_internalFileMap.get(s)).iterator();
            while (it.hasNext()) {
                FileWrite.write("DBFileMap", (String) it.next());
            }
            FileWrite.write("DBFileMap", "\n");
        }
        FileWrite.write("ZipFileMap", new StringBuilder(String.valueOf(currentZipName)).append(":\n").toString());
        it = this.zipedFiles.iterator();
        while (it.hasNext()) {
            FileWrite.write("ZipFileMap", (String) it.next());
        }
        this.zz_internalFileMap.clear();
        this.zz_internalFileList.clear();
        this.zipedFiles.clear();
    }
}
