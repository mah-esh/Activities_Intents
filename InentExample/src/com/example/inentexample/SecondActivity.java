package com.example.inentexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends Activity {

	private int i1;
	private int i2;
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_page);
		intent = getIntent();
		i1 = intent.getIntExtra("element", 0);
		i2 = intent.getIntExtra("element2", 0);
		int result = i1+i2;
		intent.putExtra("res", result);

		setResult(RESULT_OK, intent);
		finish();

	}
	
	
	/*@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		

		int result = i1 + i2;
		intent.putExtra("res", result);
		setResult(RESULT_OK, intent);
		super.onBackPressed();
	}*/
}
