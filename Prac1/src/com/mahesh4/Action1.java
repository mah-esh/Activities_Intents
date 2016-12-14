package com.mahesh4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.mahesh.prac1.R;

public class Action1 extends Activity{
	private EditText editText11;
	private EditText editText21;
	private TextView textView11;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.action1);
			
			editText11 = (EditText) findViewById(R.id.action1_editText1);
			editText21 = (EditText) findViewById(R.id.action1_editText2);
			textView11 = (TextView) findViewById(R.id.action1_textView1);
			
			try{
				if(editText11 == null && editText21 == null){
					
				}	
			}catch(NullPointerException npe){
				npe.printStackTrace();
			}
			
			
			findViewById(R.id.action1_button1).setOnClickListener(new OnClickListener() {
				
			
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent act1_in1 = new Intent(Action1.this,Action2.class);
					act1_in1.putExtra("act1_element1", Integer.parseInt(editText11.getText().toString()));
					act1_in1.putExtra("act1_element2", Integer.parseInt(editText21.getText().toString()));
					startActivityForResult(act1_in1, 100);
				}
			});
			}
		
		@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			// TODO Auto-generated method stub
			
			if(requestCode == 100 && resultCode == Activity.RESULT_OK){
				String act1_final_result1 = String.valueOf(data.getIntExtra("act2_res", 0));
				textView11.setText(act1_final_result1);				
			}else if(requestCode == 100 && resultCode == Activity.RESULT_CANCELED){
				textView11.setText("TEXT_FAILED");
			}
				super.onActivityResult(requestCode, resultCode, data);
		}
}
