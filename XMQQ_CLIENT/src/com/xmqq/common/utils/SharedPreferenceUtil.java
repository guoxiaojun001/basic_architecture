package com.xmqq.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferenceUtil {
	private static final String NAME="QQ";
	private static SharedPreferenceUtil instance;
	static{
		instance=new SharedPreferenceUtil();
	}
	
	public static SharedPreferenceUtil getInstance(){
		if(instance==null){
			instance=new SharedPreferenceUtil();
		}
		return instance;
	}
	
	public static SharedPreferences getSharePerference(Context context){
		return context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
	}
	
	public static boolean isFirst(SharedPreferences sp){
		return sp.getBoolean("isFirst", false);
	}
	
	public static void setStringSharedPerference(SharedPreferences sp,String key,String value){
		Editor editor=sp.edit();
		editor.putString(key, value);
		editor.commit();
	}
	
	public static void setBooleanSharedPerference(SharedPreferences sp,String key,boolean value){
		Editor editor=sp.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
}
