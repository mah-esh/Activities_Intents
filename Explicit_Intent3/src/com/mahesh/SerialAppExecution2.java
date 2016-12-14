package com.mahesh;

import com.mahesh.explicit_intent3.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SerialAppExecution2 extends Activity{
 
 
 private static int TIME_OUT1 = 1000;
 
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.serial2);
	
new Handler().postDelayed(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent i2 = new Intent(SerialAppExecution2.this,SerialAppExecution3.class);
			startActivity(i2);
			
			finish();
		}
	}, TIME_OUT1);
}
}
