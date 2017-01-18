package com.example.custombroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OutgoinReceiver extends BroadcastReceiver {
	
	private static final String CUSTOM_INTENT = "com.broadcast.incoming";
	
	@Override
	public void onReceive(Context context, Intent arg1) {
		Intent intent = new Intent();
		intent.setAction(CUSTOM_INTENT);
		context.sendBroadcast(intent);
	}
}
