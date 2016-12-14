package com.example.inentexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText editText;
	private EditText editText2;
	private TextView txtView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText = (EditText)findViewById(R.id.edit_1);
		editText2 = (EditText) findViewById(R.id.edit_2);
		txtView = (TextView) findViewById(R.id.textview_1);
		
		findViewById(R.id.button_1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//implicit intent
				/*Intent inent = new Intent(Intent.ACTION_VIEW);
				inent.setData(Uri.parse("http://www.google.com"));
				startActivity(inent);*/		
				//explicit intent
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("element", Integer.parseInt(editText.getText().toString()));
				intent.putExtra("element2", Integer.parseInt(editText2.getText().toString()));
				startActivityForResult(intent, 100);
			}
		});
		
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
	
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if(requestCode == 100 && resultCode == Activity.RESULT_OK){
			
			String result = String.valueOf(data.getIntExtra("res", 0));
			txtView.setText(result);
		}else if(requestCode == 100 && resultCode == Activity.RESULT_CANCELED){
			txtView.setText("failed");
		}
		
		
		super.onActivityResult(requestCode, resultCode, data);
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
