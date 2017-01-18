package com.example.progressbarexample;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {
	ProgressBar bar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bar = (ProgressBar) findViewById(R.id.progress_bar);
		findViewById(R.id.button_1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new MyTask().execute(100);
				
			}
		});
	}

	
	
	class MyTask extends AsyncTask<Integer, Integer, String> {

		int count = 1;
		@Override
		protected void onPreExecute() {
			bar.setProgress(0);
		
			super.onPreExecute();
		}
		
		@Override
		protected String doInBackground(Integer... params) {
			
			for(;count<params[0];count++) {
				try{
					Thread.sleep(100);
					bar.setProgress(count);
				}catch(Exception e) {
					return "error";
				}
			}
			
			
			
			return null;
		}
		
		@Override
		protected void onPostExecute(String result) {

			if(result == null) {
				
			}else{
				Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
			}
			super.onPostExecute(result);
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
