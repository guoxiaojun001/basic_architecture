package com.xmqq.client.app;

import aaaa.rrrr.gggg.hhhh.ssss.R;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.view.GestureDetector.OnGestureListener;
import java.util.ArrayList;
import java.util.List;

import com.xmqq.client.app.fragment.FragmentHome.OnFragmentHomeListener;
import com.xmqq.client.app.fragment.FragmentPersional;
import com.xmqq.client.app.fragment.FragmentHome;
import com.xmqq.client.app.fragment.FragmentDicovery;
import com.xmqq.client.app.fragment.FragmentProduct;
import com.xmqq.client.app.xmabstract.BaseActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MainActivity extends BaseActivity  implements OnFragmentHomeListener,OnTouchListener, OnGestureListener{

	private GestureDetector detector;
	private static final int FLING_MIN_DISTANCE = 50;   
	private static final int FLING_MIN_VELOCITY = 0;
    private FragmentTabHost mTabHost;
    private LayoutInflater mInflater;
    private List<Tab> mTabs = new ArrayList<Tab>(5);
    private OnFragmentHomeListener homeListener;
    
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        detector = new  GestureDetector(this);  
        LinearLayout linear= (LinearLayout) findViewById(R.id.linear);
        linear.setOnTouchListener(this);   
        linear.setLongClickable(true);
		
      //透明状态栏
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        init();
    }
    
    
    @Override
    protected void onResume() {
    	super.onResume();
    }
    
    
    @Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		int position = intent.getIntExtra("position", -1);
		setPosition(position);
	}
    
    public void setPosition(int position){
    	if(position<0 || position >3){//数据异常
    		mTabHost.setCurrentTab(0);
    		return;
    	}
    	mTabHost.setCurrentTab(position);
    }

    private void init() {
        mInflater = LayoutInflater.from(this);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        Tab num1 = new Tab(R.string.homepage, R.drawable.selector_icon_num1, FragmentHome.class);
        Tab num2 = new Tab(R.string.product, R.drawable.selector_icon_num3, FragmentProduct.class);
        Tab num3 = new Tab(R.string.discovery, R.drawable.selector_icon_num2, FragmentDicovery.class);
        Tab num4 = new Tab(R.string.me, R.drawable.selector_icon_num4, FragmentPersional.class);

        mTabs.add(num1);
        mTabs.add(num2);
        mTabs.add(num3);
        mTabs.add(num4);

        for (Tab tab : mTabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicator(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(), null);
        }

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if (tabId == getString(R.string.homepage)) {

                }
            }
        });

        //去掉纵向分割线
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mTabHost.setCurrentTab(0);
    }

    private View buildIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView img = (ImageView) view.findViewById(R.id.icon_tab);
        TextView text = (TextView) view.findViewById(R.id.txt_indicator);

        img.setBackgroundResource(tab.getIcon());
        text.setText(tab.getTitle());
        return view;
    }


	@Override
	public void fragmentHome(String str) {
		Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
		
	}
	
	@Override   
	public boolean onTouch(View v, MotionEvent event) {   
		// TODO Auto-generated method stub   
		Log.i("touch","touch");
		return detector.onTouchEvent(event);    
	} 

	@Override   
	public boolean onDown(MotionEvent e) {   
		// TODO Auto-generated method stub   
		return false;   
	}   
	@Override   
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,   
			float velocityY) {   
		// TODO Auto-generated method stub   
		if (e1.getX()-e2.getX() > FLING_MIN_DISTANCE    
				&& Math.abs(velocityX) > FLING_MIN_VELOCITY) { 
			if(index < 3){
				++index;
			}
			mTabHost.setCurrentTab(index);
			// Fling left    
			Toast.makeText(this, "向左手势", Toast.LENGTH_SHORT).show();    
		} else if (e2.getX()-e1.getX() > FLING_MIN_DISTANCE    
				&& Math.abs(velocityX) > FLING_MIN_VELOCITY) { 
			if(index > 0){
				--index;
			}
			mTabHost.setCurrentTab(index);
			// Fling right    
			Toast.makeText(this, "向右手势", Toast.LENGTH_SHORT).show();    
		}    
		return false;    
	} 
	
	@Override   
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,   
			float distanceY) {   
		// TODO Auto-generated method stub   
		return false;   
	} 
	
	@Override   
	public void onLongPress(MotionEvent e) {   
		// TODO Auto-generated method stub   
	}  
	
	@Override   
	public void onShowPress(MotionEvent e) {   
		// TODO Auto-generated method stub   
	} 
	
	@Override   
	public boolean onSingleTapUp(MotionEvent e) {   
		// TODO Auto-generated method stub   
		return false;   
	} 
}