package com.mahesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.mahesh.explicit_intent1.R;

public class ExplicitPage1 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.explicit1);
		Intent intent = getIntent();
		/*String msg = intent.getStringExtra("key");
		TextView t1c= (TextView) findViewById(R.id.dis);
		
		t1c.setText(msg);
		*/
		
		//TextView t1c= (TextView) findViewById(R.id.dis);
		
		
	Button button1 = (Button) findViewById(R.id.button1);
	button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(ExplicitPage1.this,ExplicitPage2.class);
				startActivity(intent1);
			}
			});
		
		Button button2 = (Button) findViewById(R.id.button2);
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent 	intent2 = new Intent(ExplicitPage1.this,ExplicitPage3.class);
			startActivity(intent2);
			}
		});
	}
}
