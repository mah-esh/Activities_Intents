package com.mahesh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.mahesh.intent_implicit1.R;

public class IntentBrowser extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.visit);
	
	final EditText editText1 = (EditText) findViewById(R.id.editText1);
	Button button1 = (Button) findViewById(R.id.button1);
	
	button1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
	
			String url = editText1.getText().toString();
			Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
			startActivity(intent);
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
	// TODO Auto-generated method stub
	super.onRestart();
}

@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

}
