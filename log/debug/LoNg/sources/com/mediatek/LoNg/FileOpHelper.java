package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileOpHelper {
    public static void doZip(String zipFileName, String dir) {
        IOException e;
        FileNotFoundException e2;
        Throwable th;
        Log.logger.info("zip dir: " + dir + " -> " + zipFileName);
        zipFileName = zipFileName.replaceAll("\\\\", "/");
        File source = new File(dir.replaceAll("\\\\", "/"));
        File zipFile = new File(zipFileName);
        if (source.exists()) {
            FileOutputStream fos = null;
            ZipOutputStream zos = null;
            try {
                FileOutputStream fos2 = new FileOutputStream(zipFile);
                try {
                    ZipOutputStream zos2 = new ZipOutputStream(new BufferedOutputStream(fos2));
                    try {
                        for (File file : source.listFiles()) {
                            addEntry("", file, zos2);
                        }
                        if (zos2 != null) {
                            try {
                                zos2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (fos2 != null) {
                            try {
                                fos2.close();
                            } catch (IOException e32) {
                                e32.printStackTrace();
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        e2 = e4;
                        zos = zos2;
                        fos = fos2;
                    } catch (IOException e5) {
                        e32 = e5;
                        zos = zos2;
                        fos = fos2;
                    } catch (Throwable th2) {
                        th = th2;
                        zos = zos2;
                        fos = fos2;
                    }
                } catch (FileNotFoundException e6) {
                    e2 = e6;
                    fos = fos2;
                    try {
                        e2.printStackTrace();
                        if (zos != null) {
                            try {
                                zos.close();
                            } catch (IOException e322) {
                                e322.printStackTrace();
                            }
                        }
                        if (fos != null) {
                            try {
                                fos.close();
                            } catch (IOException e3222) {
                                e3222.printStackTrace();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (zos != null) {
                            try {
                                zos.close();
                            } catch (IOException e32222) {
                                e32222.printStackTrace();
                            }
                        }
                        if (fos != null) {
                            try {
                                fos.close();
                            } catch (IOException e322222) {
                                e322222.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    e322222 = e7;
                    fos = fos2;
                    e322222.printStackTrace();
                    if (zos != null) {
                        try {
                            zos.close();
                        } catch (IOException e3222222) {
                            e3222222.printStackTrace();
                        }
                    }
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e32222222) {
                            e32222222.printStackTrace();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fos = fos2;
                    if (zos != null) {
                        zos.close();
                    }
                    if (fos != null) {
                        fos.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                e2 = e8;
                e2.printStackTrace();
                if (zos != null) {
                    zos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e9) {
                e32222222 = e9;
                e32222222.printStackTrace();
                if (zos != null) {
                    zos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
        }
    }

    static void addEntry(String base, File source, ZipOutputStream zos) throws IOException {
        Throwable th;
        String entry = new StringBuilder(String.valueOf(base)).append(source.getName()).toString();
        if (source.isDirectory()) {
            for (File file : source.listFiles()) {
                addEntry(new StringBuilder(String.valueOf(entry)).append("/").toString(), file, zos);
            }
            return;
        }
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            byte[] buffer = new byte[1024];
            FileInputStream fis2 = new FileInputStream(source);
            try {
                BufferedInputStream bis2 = new BufferedInputStream(fis2, buffer.length);
                try {
                    zos.putNextEntry(new ZipEntry(entry));
                    while (true) {
                        int readCount = bis2.read(buffer, 0, buffer.length);
                        if (readCount == -1) {
                            break;
                        }
                        zos.write(buffer, 0, readCount);
                    }
                    zos.closeEntry();
                    if (bis2 != null) {
                        bis2.close();
                    }
                    if (fis2 != null) {
                        fis2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bis = bis2;
                    fis = fis2;
                }
            } catch (Throwable th3) {
                th = th3;
                fis = fis2;
                if (bis != null) {
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (bis != null) {
                bis.close();
            }
            if (fis != null) {
                fis.close();
            }
            throw th;
        }
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
