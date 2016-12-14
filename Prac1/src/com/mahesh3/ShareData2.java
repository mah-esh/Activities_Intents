package com.mahesh3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.mahesh.prac1.R;

public class ShareData2 extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sharedata2);

	final EditText edit1 = (EditText) findViewById(R.id.share2_edittext1);
	
	findViewById(R.id.share2_button1).setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			/*
				Intent inte1 = new Intent(ShareData2.this,ShareData1.class);
				
				inte1.setAction("com.mahe.share");
				inte1.putExtra("get1", edit1.getText().toString());
				startActivity(inte1);
				*/
			
			
				Intent inte2 = new Intent();
				inte2.setAction("com.example.action1");
				startActivity(inte2);
				
		}
	});
}

@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}
}
