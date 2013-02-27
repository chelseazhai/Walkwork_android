package com.richitec.walkwork;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.richitec.commontoolkit.activityextension.AppLaunchActivity;
import com.richitec.walkwork.assistant.AboutActivity;

public class WalkworkAppLaunchActivity extends AppLaunchActivity {

	@Override
	public Drawable splashImg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intent intentActivity() {
		// go to walkwork about activity
		return new Intent(this, AboutActivity.class);
	}

	@Override
	public void didFinishLaunching() {
		try {
			// sleep 3 seconds
			Log.d("@", "I'm sleeping...");

			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
