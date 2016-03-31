package com.xmqq.client.app.fragment;


import java.util.ArrayList;
import java.util.List;

import com.xmqq.client.app.Tab;
import com.xmqq.client.app.fragment.subfragment.SubFragment1;
import com.xmqq.client.app.fragment.subfragment.SubFragment2;
import com.xmqq.client.app.fragment.subfragment.SubFragment3;
import com.xmqq.client.app.xmabstract.BaseFragment;
import com.xmqq.common.utils.LogUtils;
import com.xmqq.common.utils.XmqqToast;

import aaaa.rrrr.gggg.hhhh.ssss.R;
import android.app.Activity;
import android.content.Context;
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
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class FragmentDicovery extends BaseFragment {
	public static final String TAG = "FragmentDicovery";
	FragmentTabHost mTabHost = null;
	 private List<Tab> mTabs = new ArrayList<Tab>(3);
	 LayoutInflater inflater;
	
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
		inflater =  (LayoutInflater)getActivity().getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
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
		
		Tab num1 = new Tab(R.string.xiaomi, R.drawable.selector_icon_num1, SubFragment1.class);
		Tab num2 = new Tab(R.string.iphone, R.drawable.selector_icon_num3, SubFragment2.class);
		Tab num3 = new Tab(R.string.meizu, R.drawable.selector_icon_num2, SubFragment3.class);
		
		mTabs.add(num1);
		mTabs.add(num2);
		mTabs.add(num3);
		
		for (Tab tab : mTabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicator(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(), null);
        }
		
//
//		mTabHost.addTab(mTabHost.newTabSpec("sub1").setIndicator("推荐"),
//				SubFragment1.class, null);
//
//		mTabHost.addTab(mTabHost.newTabSpec("sub2").setIndicator("微课堂"),
//				SubFragment2.class, null);
//
//		mTabHost.addTab(mTabHost.newTabSpec("sub3").setIndicator("话题"),
//				SubFragment3.class, null);
		mTabHost.getTabWidget().setDividerDrawable(R.color.white);

	}
	
	private View buildIndicator(Tab tab) {
        View view = inflater.inflate(R.layout.subtab_indicator, null);
        ImageView img = (ImageView) view.findViewById(R.id.icon_tab);
        TextView text = (TextView) view.findViewById(R.id.txt_indicator);

        img.setBackgroundResource(tab.getIcon());
        text.setText(tab.getTitle());
        return view;
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
