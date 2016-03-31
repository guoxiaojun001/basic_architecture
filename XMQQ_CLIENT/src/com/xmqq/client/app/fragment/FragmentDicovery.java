package com.xmqq.client.app.fragment;


import com.xmqq.client.app.fragment.subfragment.SubFragment1;
import com.xmqq.client.app.fragment.subfragment.SubFragment2;
import com.xmqq.client.app.fragment.subfragment.SubFragment3;
import com.xmqq.client.app.xmabstract.BaseFragment;
import com.xmqq.common.utils.LogUtils;
import com.xmqq.common.utils.XmqqToast;

import aaaa.rrrr.gggg.hhhh.ssss.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDicovery extends BaseFragment {
	public static final String TAG = "FragmentDicovery";
	FragmentTabHost mTabHost = null;
	
	public interface OnFragmentDicoveryListener {
		public void OnFragmentDicovery(String str);
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		LogUtils.Log(TAG, ">>>>onAttach>>>>>");
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		LogUtils.Log(TAG, ">>>>onCreate>>>>>");
		
		Bundle bundle = getArguments();
		if (null != bundle) {
			//
		}
	}
	
	@Override
	public void onHiddenChanged(boolean hidden) {
		// TODO Auto-generated method stub
		LogUtils.Log(TAG, ">>>>onHiddenChanged>>>>>" + hidden);
		super.onHiddenChanged(hidden);
	}
	
//	@Override
//	public void setUserVisibleHint(boolean isVisibleToUser) {
//		// TODO Auto-generated method stub
//		LogUtils.Log(TAG, ">>>>setUserVisibleHint>>>>>" + isVisibleToUser);
//		super.setUserVisibleHint(isVisibleToUser);
//	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_product, null);
		initView(view);

		return view;
	}

	private void initView(View view) {

		mTabHost = (FragmentTabHost) view.findViewById(android.R.id.tabhost);
		
		mTabHost.setup(getActivity(), getChildFragmentManager(),
				android.R.id.tabcontent);

		mTabHost.addTab(mTabHost.newTabSpec("sub1").setIndicator("推荐"),
				SubFragment1.class, null);

		mTabHost.addTab(mTabHost.newTabSpec("sub2").setIndicator("微课堂"),
				SubFragment2.class, null);

		mTabHost.addTab(mTabHost.newTabSpec("sub3").setIndicator("话题"),
				SubFragment3.class, null);
		
		mTabHost.getTabWidget().setDividerDrawable(R.color.white);

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
