package com.mahesh1;

import com.mahesh.prac1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SerialExec1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.serial1);
		
		Intent i1 = new Intent(SerialExec1.this,SerialExec2.class);
		startActivity(i1);
	}
}
