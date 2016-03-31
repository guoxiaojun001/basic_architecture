package com.xmqq.client.app.fragment;


import com.xmqq.client.app.xmabstract.BaseFragment;
import com.xmqq.common.utils.LogUtils;
import com.xmqq.common.utils.XmqqToast;

import aaaa.rrrr.gggg.hhhh.ssss.R;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentHome extends BaseFragment implements OnClickListener{
	public static final String TAG = "FragmentHome";
	OnFragmentHomeListener homeListener;
	private View rootView;
	TextView tv_1;
	
	public interface OnFragmentHomeListener {
		public void fragmentHome(String str);
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			homeListener = (OnFragmentHomeListener) activity;
         } catch (ClassCastException e) {
         }
		LogUtils.Log(TAG, ">>>>onAttach>>>>>" + homeListener);
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
		
		if (null != rootView) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (null != parent) {
                parent.removeView(rootView);
            }
        } else {
            rootView = inflater.inflate(R.layout.fragment_home, null);
            initView();// 控件初始化
        }

		return rootView;

	}
	
	private void initView() {
		tv_1 = (TextView) rootView.findViewById(R.id.tv_1);
		tv_1.setOnClickListener(this);
		
	}

	@Override
	public void onHiddenChanged(boolean hidden) {
		// TODO Auto-generated method stub
		LogUtils.Log(TAG, ">>>>onHiddenChanged>>>>>" + hidden);
		super.onHiddenChanged(hidden);
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

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_1:
			homeListener.fragmentHome("WWWWWWW");
			break;

		default:
			break;
		}
		
	}
}
