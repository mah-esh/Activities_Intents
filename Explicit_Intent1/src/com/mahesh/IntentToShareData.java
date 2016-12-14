package com.mahesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.mahesh.explicit_intent1.R;

public class IntentToShareData extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sharedata);
		
		final EditText edt1 = (EditText) findViewById(R.id.e1);
		Button bt1 = (Button) findViewById(R.id.b1);
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*Intent inent2 = new Intent();
				inent2.setAction("com.vinay.explicit");
				inent2.putExtra("key", edt1.getText().toString());
				startActivity(inent2);*/
				
				/*Intent inent2 = new Intent();
				inent2.setAction("com.example.action");
				startActivity(inent2);*/
				
			}
		});
	}
}
