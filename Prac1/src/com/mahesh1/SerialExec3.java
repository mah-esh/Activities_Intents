package com.mahesh1;

import com.mahesh.prac1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SerialExec3 extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.serial3);
		
		Intent i3 = new Intent(SerialExec3.this,SerialExec4.class);
		startActivity(i3);
	}

}
