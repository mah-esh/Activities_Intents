package com.mahesh3;

import com.mahesh.prac1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShareData1 extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sharedata1);
	
	
	Intent intent_1 = getIntent();
	
	String data1 = intent_1.getStringExtra("get1");
	
	TextView tv_1 = (TextView) findViewById(R.id.share1_textview1);
	
	
	
	tv_1.setText(data1);
	
	
}
}
