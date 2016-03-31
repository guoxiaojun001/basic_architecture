package com.example.imageviewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.imageviewpager.ImageCycleView.ImageCycleViewListener;

public class MainActivity extends Activity {

	private ImageCycleView mAdView;
	private ArrayList<String> mImageUrl = null;
	private String imageUrl1 = "http://img.lakalaec.com/ad/57ab6dc2-43f2-4087-81e2-b5ab5681642d.jpg";
	private String imageUrl2 = "http://img.lakalaec.com/ad/cb56a1a6-6c33-41e4-9c3c-363f4ec6b728.jpg";
	private String imageUrl3 = "http://img.lakalaec.com/ad/e4229e25-3906-4049-9fe8-e2b52a98f6d1.jpg";
	
	/**
	 * 游标是圆形还是长条，要是设置为0是长条，要是1就是圆形 默认是圆形
	 */
	public int stype=2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mImageUrl = new ArrayList<String>();
		mImageUrl.add(imageUrl1);
		mImageUrl.add(imageUrl2);
		mImageUrl.add(imageUrl3);
		mAdView = (ImageCycleView) findViewById(R.id.ad_view);
		mAdView.setImageResources(mImageUrl , mAdCycleViewListener,stype);
	}

	private ImageCycleViewListener mAdCycleViewListener = new ImageCycleViewListener() {
		@Override
		public void onImageClick(int position, View imageView) {
			// TODO 单击图片处理事件
			Toast.makeText(MainActivity.this, "你妹" + position , 1).show();
		}
	};
}
