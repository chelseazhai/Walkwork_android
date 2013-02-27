package com.richitec.walkwork.account;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.richitec.walkwork.R;

public class AccountSettingActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set content view
		setContentView(R.layout.account_setting_activity_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// inflate menu
		getMenuInflater().inflate(R.menu.account_setting_activity_menu, menu);

		return true;
	}

}
