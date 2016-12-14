package com.mahesh4;

import com.mahesh.prac1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Action2 extends Activity{
	private int i1;
	private int i2;
	private Intent act1_in1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.action2);
		
		 act1_in1 = getIntent();
	i1 = act1_in1.getIntExtra("act1_element1", 0);
	i2 = act1_in1.getIntExtra("act1_element2", 0);
	
	int	act2_result = i1+i2;
		
		act1_in1.putExtra("act2_res", act2_result);
		
		setResult(RESULT_OK, act1_in1);
		finish();
	}
}
