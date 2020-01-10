package com.mediatek.LoNg;

import java.io.File;

public class FileOpHelper {
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0086=Splitter:B:34:0x0086, B:21:0x006d=Splitter:B:21:0x006d} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A:{SYNTHETIC, Splitter:B:24:0x0072} */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A:{SYNTHETIC, Splitter:B:27:0x0077} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b A:{SYNTHETIC, Splitter:B:37:0x008b} */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090 A:{SYNTHETIC, Splitter:B:40:0x0090} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a1 A:{SYNTHETIC, Splitter:B:48:0x00a1} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6 A:{SYNTHETIC, Splitter:B:51:0x00a6} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A:{SYNTHETIC, Splitter:B:24:0x0072} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A:{SYNTHETIC, Splitter:B:27:0x0077} */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b A:{SYNTHETIC, Splitter:B:37:0x008b} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090 A:{SYNTHETIC, Splitter:B:40:0x0090} */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a1 A:{SYNTHETIC, Splitter:B:48:0x00a1} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6 A:{SYNTHETIC, Splitter:B:51:0x00a6} */
    public static void doZip(java.lang.String r12, java.lang.String r13) {
        /*
        r8 = com.mediatek.LoNg.utils.log.Log.logger;
        r9 = new java.lang.StringBuilder;
        r10 = "zip dir: ";
        r9.<init>(r10);
        r9 = r9.append(r13);
        r10 = " -> ";
        r9 = r9.append(r10);
        r9 = r9.append(r12);
        r9 = r9.toString();
        r8.info(r9);
        r8 = "\\\\";
        r9 = "/";
        r12 = r12.replaceAll(r8, r9);
        r8 = "\\\\";
        r9 = "/";
        r13 = r13.replaceAll(r8, r9);
        r4 = new java.io.File;
        r4.<init>(r13);
        r5 = new java.io.File;
        r5.<init>(r12);
        r8 = r4.exists();
        if (r8 == 0) goto L_0x0061;
    L_0x003e:
        r2 = 0;
        r6 = 0;
        r3 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0085 }
        r3.<init>(r5);	 Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0085 }
        r7 = new java.util.zip.ZipOutputStream;	 Catch:{ FileNotFoundException -> 0x00cc, IOException -> 0x00c5, all -> 0x00be }
        r8 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x00cc, IOException -> 0x00c5, all -> 0x00be }
        r8.<init>(r3);	 Catch:{ FileNotFoundException -> 0x00cc, IOException -> 0x00c5, all -> 0x00be }
        r7.<init>(r8);	 Catch:{ FileNotFoundException -> 0x00cc, IOException -> 0x00c5, all -> 0x00be }
        r9 = r4.listFiles();	 Catch:{ FileNotFoundException -> 0x00cf, IOException -> 0x00c8, all -> 0x00c1 }
        r10 = r9.length;	 Catch:{ FileNotFoundException -> 0x00cf, IOException -> 0x00c8, all -> 0x00c1 }
        r8 = 0;
    L_0x0055:
        if (r8 < r10) goto L_0x0062;
    L_0x0057:
        if (r7 == 0) goto L_0x005c;
    L_0x0059:
        r7.close();	 Catch:{ IOException -> 0x00b4 }
    L_0x005c:
        if (r3 == 0) goto L_0x0061;
    L_0x005e:
        r3.close();	 Catch:{ IOException -> 0x00b9 }
    L_0x0061:
        return;
    L_0x0062:
        r1 = r9[r8];	 Catch:{ FileNotFoundException -> 0x00cf, IOException -> 0x00c8, all -> 0x00c1 }
        r11 = "";
        addEntry(r11, r1, r7);	 Catch:{ FileNotFoundException -> 0x00cf, IOException -> 0x00c8, all -> 0x00c1 }
        r8 = r8 + 1;
        goto L_0x0055;
    L_0x006c:
        r0 = move-exception;
    L_0x006d:
        r0.printStackTrace();	 Catch:{ all -> 0x009e }
        if (r6 == 0) goto L_0x0075;
    L_0x0072:
        r6.close();	 Catch:{ IOException -> 0x0080 }
    L_0x0075:
        if (r2 == 0) goto L_0x0061;
    L_0x0077:
        r2.close();	 Catch:{ IOException -> 0x007b }
        goto L_0x0061;
    L_0x007b:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0061;
    L_0x0080:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0075;
    L_0x0085:
        r0 = move-exception;
    L_0x0086:
        r0.printStackTrace();	 Catch:{ all -> 0x009e }
        if (r6 == 0) goto L_0x008e;
    L_0x008b:
        r6.close();	 Catch:{ IOException -> 0x0099 }
    L_0x008e:
        if (r2 == 0) goto L_0x0061;
    L_0x0090:
        r2.close();	 Catch:{ IOException -> 0x0094 }
        goto L_0x0061;
    L_0x0094:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0061;
    L_0x0099:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x008e;
    L_0x009e:
        r8 = move-exception;
    L_0x009f:
        if (r6 == 0) goto L_0x00a4;
    L_0x00a1:
        r6.close();	 Catch:{ IOException -> 0x00aa }
    L_0x00a4:
        if (r2 == 0) goto L_0x00a9;
    L_0x00a6:
        r2.close();	 Catch:{ IOException -> 0x00af }
    L_0x00a9:
        throw r8;
    L_0x00aa:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00a4;
    L_0x00af:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00a9;
    L_0x00b4:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x005c;
    L_0x00b9:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0061;
    L_0x00be:
        r8 = move-exception;
        r2 = r3;
        goto L_0x009f;
    L_0x00c1:
        r8 = move-exception;
        r6 = r7;
        r2 = r3;
        goto L_0x009f;
    L_0x00c5:
        r0 = move-exception;
        r2 = r3;
        goto L_0x0086;
    L_0x00c8:
        r0 = move-exception;
        r6 = r7;
        r2 = r3;
        goto L_0x0086;
    L_0x00cc:
        r0 = move-exception;
        r2 = r3;
        goto L_0x006d;
    L_0x00cf:
        r0 = move-exception;
        r6 = r7;
        r2 = r3;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mediatek.LoNg.FileOpHelper.doZip(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    static void addEntry(java.lang.String r13, java.io.File r14, java.util.zip.ZipOutputStream r15) throws java.io.IOException {
        /*
        r8 = 0;
        r9 = new java.lang.StringBuilder;
        r10 = java.lang.String.valueOf(r13);
        r9.<init>(r10);
        r10 = r14.getName();
        r9 = r9.append(r10);
        r3 = r9.toString();
        r9 = r14.isDirectory();
        if (r9 == 0) goto L_0x003f;
    L_0x001c:
        r9 = r14.listFiles();
        r10 = r9.length;
    L_0x0021:
        if (r8 < r10) goto L_0x0024;
    L_0x0023:
        return;
    L_0x0024:
        r4 = r9[r8];
        r11 = new java.lang.StringBuilder;
        r12 = java.lang.String.valueOf(r3);
        r11.<init>(r12);
        r12 = "/";
        r11 = r11.append(r12);
        r11 = r11.toString();
        addEntry(r11, r4, r15);
        r8 = r8 + 1;
        goto L_0x0021;
    L_0x003f:
        r5 = 0;
        r0 = 0;
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2 = new byte[r8];	 Catch:{ all -> 0x0083 }
        r6 = new java.io.FileInputStream;	 Catch:{ all -> 0x0083 }
        r6.<init>(r14);	 Catch:{ all -> 0x0083 }
        r1 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0085 }
        r8 = r2.length;	 Catch:{ all -> 0x0085 }
        r1.<init>(r6, r8);	 Catch:{ all -> 0x0085 }
        r7 = 0;
        r8 = new java.util.zip.ZipEntry;	 Catch:{ all -> 0x0075 }
        r8.<init>(r3);	 Catch:{ all -> 0x0075 }
        r15.putNextEntry(r8);	 Catch:{ all -> 0x0075 }
    L_0x0059:
        r8 = 0;
        r9 = r2.length;	 Catch:{ all -> 0x0075 }
        r7 = r1.read(r2, r8, r9);	 Catch:{ all -> 0x0075 }
        r8 = -1;
        if (r7 != r8) goto L_0x0070;
    L_0x0062:
        r15.closeEntry();	 Catch:{ all -> 0x0075 }
        if (r1 == 0) goto L_0x006a;
    L_0x0067:
        r1.close();
    L_0x006a:
        if (r6 == 0) goto L_0x0023;
    L_0x006c:
        r6.close();
        goto L_0x0023;
    L_0x0070:
        r8 = 0;
        r15.write(r2, r8, r7);	 Catch:{ all -> 0x0075 }
        goto L_0x0059;
    L_0x0075:
        r8 = move-exception;
        r0 = r1;
        r5 = r6;
    L_0x0078:
        if (r0 == 0) goto L_0x007d;
    L_0x007a:
        r0.close();
    L_0x007d:
        if (r5 == 0) goto L_0x0082;
    L_0x007f:
        r5.close();
    L_0x0082:
        throw r8;
    L_0x0083:
        r8 = move-exception;
        goto L_0x0078;
    L_0x0085:
        r8 = move-exception;
        r5 = r6;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mediatek.LoNg.FileOpHelper.addEntry(java.lang.String, java.io.File, java.util.zip.ZipOutputStream):void");
    }

    public static boolean deleteDirectory(File directory) {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    } else {
                        files[i].delete();
                    }
                }
            }
        }
        return directory.delete();
    }

    public static void main(String[] args) {
        doZip("D:/temp/ALPS01039623/20130929_101350_883_path_unix.zip", "D:/temp/ALPS01039623/20130929_101350_883/");
    }
}
