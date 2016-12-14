package com.mahesh2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.mahesh.prac1.R;

public class ExplicitShift1 extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.explicit1);
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in1 = new Intent(ExplicitShift1.this,ExplicitShift2.class);
				startActivity(in1);
			}
		});
		
		findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in2 = new Intent(ExplicitShift1.this,ExplicitShift3.class);
				startActivity(in2);
			}
		});
	}
}
