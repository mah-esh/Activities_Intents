package com.example.custombroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class IncomingReceiver extends BroadcastReceiver {
	private static final String CUSTOM_INTENT = "com.broadcast.incoming";

	@Override
	public void onReceive(Context context, Intent intent) {

		if(intent.getAction().equals(CUSTOM_INTENT)) {
			Toast.makeText(context, "action received", Toast.LENGTH_LONG).show();
		}
		
	}
}
