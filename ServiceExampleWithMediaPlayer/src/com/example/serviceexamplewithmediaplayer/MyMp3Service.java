package com.example.serviceexamplewithmediaplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyMp3Service extends Service {

	MediaPlayer mp;
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		mp = MediaPlayer.create(getApplicationContext(),R.raw.mp);
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		mp.start();
		return START_STICKY;
	}
	
	@Override
	public void onDestroy() {
		mp.release();
		super.onDestroy();
	}

}
