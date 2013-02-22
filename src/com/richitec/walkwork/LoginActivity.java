package com.richitec.walkwork;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class LoginActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.login_activity_menu, menu);
		return true;
	}

}
