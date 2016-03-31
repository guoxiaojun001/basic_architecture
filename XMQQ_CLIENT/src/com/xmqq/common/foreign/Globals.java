package com.xmqq.common.foreign;

import java.io.File;


import android.content.Context;

public class Globals {
    private static Context context;
    private static String lastError;
    private static File chrootDir = new File(FileUtil.getSdDirectory());
    private static String username = null;



    public static File getChrootDir() {
        return chrootDir;
    }

    public static void setChrootDir(File chrootDir) {
        if(chrootDir.isDirectory()) {
            Globals.chrootDir = chrootDir;
        }
    }

    public static String getLastError() {
        return lastError;
    }

    public static void setLastError(String lastError) {
        Globals.lastError = lastError;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        if(context != null) {
            Globals.context = context;
        }
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Globals.username = username;
    }

}
