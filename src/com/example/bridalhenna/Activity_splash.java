package com.example.bridalhenna;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Activity_splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity__splash);
		Thread splashThread = new Thread() {

			public void run() {
				try {
					sleep(1500);
				} catch (InterruptedException e) {
				} finally {
					Intent i = new Intent(Activity_splash.this,ActivityMenu.class);
					startActivity(i);
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
					finish();
				}
			}

		};

		splashThread.start();
	}



}

	
