package com.mahesh1;

import com.mahesh.prac1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SerialExec2 extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.serial2);
	
	Intent i2 = new Intent(SerialExec2.this,SerialExec3.class);
	startActivity(i2);
}
}
