package com.example.downloadimagefiletask;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.AsyncTask;

public class ImageDownloader extends AsyncTask<Void, Void, String> {

	private ImageDownladerActivity mactivity;
	private String url;
	private ProgressDialog dialog;
	private Bitmap bmp;
	public ImageDownloader(ImageDownladerActivity mcontext, String url) {
		this.mactivity = mcontext;
		this.url = url;
	}

	@Override
	protected void onPreExecute() {
		dialog = new ProgressDialog(mactivity);
		dialog.setMessage("Downloading image");
		dialog.show();
	}

	@Override
	protected String doInBackground(Void... params) {
		bmp = mactivity.downloadBitmap(url);
		
		return null;
	}

	@Override
	protected void onPostExecute(String result) {
		if(result == null) {
			dialog.dismiss();
			mactivity.setImage(bmp);
		}
	}
}