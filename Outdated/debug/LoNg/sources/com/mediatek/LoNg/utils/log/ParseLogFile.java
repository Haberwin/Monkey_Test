package com.mediatek.LoNg.utils.log;

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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startParse(java.lang.String r12, java.lang.String r13) {
        /*
        r11 = this;
        r9 = 1;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r4 = 20;
        r3 = 0;
        r2 = r13;
        r8 = ptnName;
        r6 = r8.matcher(r13);
        r8 = r6.matches();
        if (r8 == 0) goto L_0x001f;
    L_0x0016:
        r8 = "logfile hit";
        com.mediatek.LoNg.utils.log.Log.DEBUG(r8);
        r2 = r6.group(r9);
    L_0x001f:
        r0 = new java.io.BufferedReader;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r8 = new java.io.InputStreamReader;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9.<init>(r13);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r8.<init>(r9);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r0.<init>(r8);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
    L_0x002e:
        r4 = r4 + -1;
        if (r4 < 0) goto L_0x0038;
    L_0x0032:
        r5 = r0.readLine();	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        if (r5 != 0) goto L_0x0055;
    L_0x0038:
        r0.close();	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
    L_0x003b:
        r8 = "ZZ_INTERNAL";
        r8 = r2.indexOf(r8);
        if (r8 < 0) goto L_0x004d;
    L_0x0043:
        r8 = r11.zz_internalFileList;
        r8.add(r13);
        r8 = r11.zz_internalFileMap;
        r8.put(r13, r7);
    L_0x004d:
        if (r3 != 0) goto L_0x0054;
    L_0x004f:
        r8 = "nothing write to the file 'ZipFileMap'";
        com.mediatek.LoNg.utils.log.Log.DEBUG(r8);
    L_0x0054:
        return;
    L_0x0055:
        r8 = "ZZ_INTERNAL";
        r8 = r2.indexOf(r8);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        if (r8 < 0) goto L_0x0066;
    L_0x005d:
        r7.add(r5);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        goto L_0x002e;
    L_0x0061:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003b;
    L_0x0066:
        r8 = "/mobilelog/";
        r8 = r13.contains(r8);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        if (r8 == 0) goto L_0x002e;
    L_0x006e:
        r8 = "kernel_log";
        r8 = r2.indexOf(r8);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        if (r8 < 0) goto L_0x00ca;
    L_0x0076:
        r8 = ptnKernelLog;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r6 = r8.matcher(r5);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r8 = r6.matches();	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        if (r8 != 0) goto L_0x0088;
    L_0x0082:
        r8 = ptnAndroidLog;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r6 = r8.matcher(r5);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
    L_0x0088:
        r8 = r6.matches();	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        if (r8 == 0) goto L_0x002e;
    L_0x008e:
        r3 = 1;
        r8 = r11.zipedFiles;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r10 = "  -- ";
        r9.<init>(r10);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9 = r9.append(r12);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r10 = "; ";
        r9 = r9.append(r10);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9 = r9.append(r2);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r10 = ";\tstartTime: ";
        r9 = r9.append(r10);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r10 = 1;
        r10 = r6.group(r10);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9 = r9.append(r10);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r10 = 10;
        r9 = r9.append(r10);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r9 = r9.toString();	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r8.add(r9);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        goto L_0x0038;
    L_0x00c4:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003b;
    L_0x00ca:
        r8 = ptnAndroidLog;	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        r6 = r8.matcher(r5);	 Catch:{ FileNotFoundException -> 0x0061, IOException -> 0x00c4 }
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mediatek.LoNg.utils.log.ParseLogFile.startParse(java.lang.String, java.lang.String):void");
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
