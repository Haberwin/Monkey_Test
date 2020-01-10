package com.mediatek.LoNg.utils.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class FileWrite {
    private static HashMap<String, FileWriter> ioFileWter = new HashMap();
    private static final String ktLog = "KT-log/";

    private static synchronized void openFile(String fileName) {
        synchronized (FileWrite.class) {
            String filePath = new StringBuilder(ktLog).append(fileName).toString();
            if (!new File(ktLog).exists()) {
                new File(ktLog).mkdirs();
            }
            File tagFile = new File(filePath);
            if (tagFile.exists()) {
                File tagFile_bak = new File(new StringBuilder(String.valueOf(filePath)).append("-").append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())).toString());
                if (tagFile.renameTo(tagFile_bak)) {
                    System.out.println("rename " + filePath + " to " + tagFile_bak);
                }
            }
            try {
                ioFileWter.put(fileName, new FileWriter(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void write(String fileName, String s) {
        synchronized (FileWrite.class) {
            if (ioFileWter.get(fileName) == null) {
                openFile(fileName);
            }
            FileWriter fileWterItem = (FileWriter) ioFileWter.get(fileName);
            try {
                fileWterItem.write(s, 0, s.length());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWterItem.flush();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
