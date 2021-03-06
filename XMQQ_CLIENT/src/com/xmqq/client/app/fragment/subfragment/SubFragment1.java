package com.xmqq.client.app.fragment.subfragment;


import com.xmqq.client.app.activity.WaterCameraActivity;
import com.xmqq.client.app.xmabstract.BaseFragment;
import com.xmqq.common.utils.LogUtils;
import com.xmqq.common.utils.XmqqToast;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;

public class SubFragment1 extends BaseFragment {
	public static final String TAG = "SubFragment1";
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		LogUtils.Log(TAG, ">>>>onAttach>>>>>");
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtils.Log(TAG, ">>>>onCreate>>>>>");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		LogUtils.Log(TAG, ">>>>onCreateView>>>>>");
		TextView tv = new TextView(getActivity());
		tv.setTextSize(25);
		tv.setBackgroundColor(Color.parseColor("#FFA07A"));
		tv.setText("推荐");
		tv.setGravity(Gravity.CENTER);
//		tv.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View view) {
//				// TODO Auto-generated method stub
//				startActivity(new Intent(getActivity(), WaterCameraActivity.class));
//				
//			}
//		});
		return tv;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		LogUtils.Log(TAG, ">>>>onActivityCreated>>>>>");
	}
	
	@Override
	public void onStart() {
		super.onStart();
		LogUtils.Log(TAG, ">>>>onStart>>>>>");
	}
	
	@Override
	public void onResume() {
		super.onResume();
		LogUtils.Log(TAG, ">>>>onResume>>>>>");
	}
	
	@Override
	public void onPause() {
		super.onPause();
		LogUtils.Log(TAG, ">>>>onPause>>>>>");
	}
	
	@Override
	public void onStop() {
		super.onStop();
		LogUtils.Log(TAG, ">>>>onStop>>>>>");
	}
	
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		LogUtils.Log(TAG, ">>>>onDestroyView>>>>>");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		LogUtils.Log(TAG, ">>>>onDestroy>>>>>");
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
		LogUtils.Log(TAG, ">>>>onDetach>>>>>");
	}
}
