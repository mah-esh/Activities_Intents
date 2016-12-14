package com.mahesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.mahesh.explicit_intent3.R;

public class SerialAppExecution extends Activity {
private static int TIME_OUT = 1000;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.serial1);

	new Handler().postDelayed(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent i1 = new Intent(SerialAppExecution.this, SerialAppExecution2.class);
			startActivity(i1);
			
			finish();
		}
	}, TIME_OUT);
		
		
		
	}

}
