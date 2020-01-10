package com.mediatek.LoNg;

import com.mediatek.LoNg.utils.log.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AdbAdapter {
    public static final String ADB = "adb";

    /* renamed from: com.mediatek.LoNg.AdbAdapter$1 */
    class AnonymousClass1 extends Thread {
        private final /* synthetic */ Process val$proc;
        private final /* synthetic */ ArrayList val$result;

        AnonymousClass1(String $anonymous0, Process process, ArrayList arrayList) {
            this.val$proc = process;
            this.val$result = arrayList;
            super($anonymous0);
        }

        public void run() {
            BufferedReader errReader = new BufferedReader(new InputStreamReader(this.val$proc.getErrorStream()));
            while (true) {
                try {
                    String line = errReader.readLine();
                    if (line != null) {
                        this.val$result.add(line);
                    } else {
                        return;
                    }
                } catch (IOException e) {
                    return;
                }
            }
        }
    }

    /* renamed from: com.mediatek.LoNg.AdbAdapter$2 */
    class AnonymousClass2 extends Thread {
        private final /* synthetic */ Process val$proc;
        private final /* synthetic */ ArrayList val$result;

        AnonymousClass2(String $anonymous0, Process process, ArrayList arrayList) {
            this.val$proc = process;
            this.val$result = arrayList;
            super($anonymous0);
        }

        public void run() {
            BufferedReader outReader = new BufferedReader(new InputStreamReader(this.val$proc.getInputStream()));
            while (true) {
                try {
                    String line = outReader.readLine();
                    if (line != null) {
                        this.val$result.add(line);
                    } else {
                        return;
                    }
                } catch (IOException e) {
                    return;
                }
            }
        }
    }

    /* renamed from: com.mediatek.LoNg.AdbAdapter$3 */
    class AnonymousClass3 extends Thread {
        private final /* synthetic */ Process val$proc;

        AnonymousClass3(String $anonymous0, Process process) {
            this.val$proc = process;
            super($anonymous0);
        }

        public void run() {
            int timeCount = 0;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(5000);
                    timeCount++;
                    if (timeCount * 5 > 360 && this.val$proc != null) {
                        Log.logger.info("!!!Kill blocking adb, Adb has been blocking 12 minutes");
                        this.val$proc.destroy();
                        return;
                    }
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static ArrayList<String> ExecuteSN(String sn, ArrayList<String> parameter) {
        String ADB_path = new StringBuilder(String.valueOf(new File("").getAbsolutePath())).append(File.separator).append(ADB).toString();
        int len = 0;
        if (parameter != null) {
            len = parameter.size();
        }
        String[] command = new String[(len + 3)];
        command[0] = ADB_path;
        command[1] = "-s";
        command[2] = sn;
        for (int i = 3; i < command.length; i++) {
            command[i] = (String) parameter.get(i - 3);
        }
        return ExecuteCommand(command);
    }

    public static ArrayList<String> Execute(ArrayList<String> parameter) {
        String ADB_path = new StringBuilder(String.valueOf(new File("").getAbsolutePath())).append(File.separator).append(ADB).toString();
        int len = 0;
        if (parameter != null) {
            len = parameter.size();
        }
        String[] command = new String[(len + 1)];
        command[0] = ADB_path;
        for (int i = 1; i < command.length; i++) {
            command[i] = (String) parameter.get(i - 1);
        }
        return ExecuteCommand(command);
    }

    private static ArrayList<String> ExecuteCommand(String[] command) {
        IOException e;
        Thread thread;
        ArrayList<String> result = new ArrayList();
        Thread t3 = null;
        try {
            Thread t2;
            String log = "";
            for (String string : command) {
                log = new StringBuilder(String.valueOf(log)).append(" ").append(string).toString();
            }
            Log.logger.info("shell cmd: " + log);
            Process proc = Runtime.getRuntime().exec(command, null, null);
            Thread t1 = new AnonymousClass1("", proc, result);
            try {
                t2 = new AnonymousClass2("", proc, result);
            } catch (IOException e2) {
                e = e2;
                thread = t1;
                e.printStackTrace();
                t3.interrupt();
                return result;
            }
            Thread thread2;
            try {
                t1.start();
                t2.start();
                try {
                    t1.join(180000);
                    t2.join(180000);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                Thread t32 = new AnonymousClass3("WatchDog", proc);
                try {
                    t32.start();
                    try {
                        proc.waitFor();
                        t3 = t32;
                        thread2 = t2;
                        thread = t1;
                    } catch (InterruptedException e32) {
                        e32.printStackTrace();
                        t3 = t32;
                        thread2 = t2;
                        thread = t1;
                    }
                } catch (IOException e4) {
                    e = e4;
                    t3 = t32;
                    thread2 = t2;
                    thread = t1;
                    e.printStackTrace();
                    t3.interrupt();
                    return result;
                }
            } catch (IOException e5) {
                e = e5;
                thread2 = t2;
                thread = t1;
                e.printStackTrace();
                t3.interrupt();
                return result;
            }
        } catch (IOException e6) {
            e = e6;
        }
        t3.interrupt();
        return result;
    }
}
