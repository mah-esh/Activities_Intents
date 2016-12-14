package com.mahesh;

import com.mahesh.explicit_intent3.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SerialAppExecution3 extends Activity{
 
	private static int TIME_OUT2 = 1000;
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.serial3);
	
new Handler().postDelayed(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent i3 = new Intent(SerialAppExecution3.this,SerialAppExecution4.class);
			startActivity(i3);
			
			finish();
		}
	}, TIME_OUT2);
}
}
