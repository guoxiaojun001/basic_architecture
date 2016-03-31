package com.xmqq.common.utils;

import android.util.Log;

public class LogUtils {

	public static boolean isTarget = true;
	

	public static void Log(String msg) {
		if (isTarget) {

			Log("info", msg);

		}
	}
	public static void Log(String tag, String msg) {
		if (isTarget) {
			Log.i(tag, msg);
		}
	}

	public static void LogErr(String tag, String msg) {
		if (isTarget) {
			Log.e(tag, msg);
		}
	}

	public static void LogErr(String msg) {
		if (isTarget) {
			LogErr("error", msg);
		}
	}

}
