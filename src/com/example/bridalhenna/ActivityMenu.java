package com.example.bridalhenna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityMenu extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		Button pack=(Button)findViewById(R.id.packages);
		Button gal=(Button)findViewById(R.id.gallery);
		Button con=(Button)findViewById(R.id.contact);
		Button about=(Button)findViewById(R.id.about);
		//Button about=(Button)findViewById(R.id.about);
		//Button niom=(Button)findViewById(R.id.niom);
		
		
		
		pack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Packages.class);
				startActivity(i);
				
			}
		});
		
		gal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Gallery.class);
				startActivity(i);
				
			}
		});
con.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Contact.class);
				startActivity(i);
				
			}
		});
		
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),About.class);
				startActivity(i);
				
			}
		});

	}

	@Override
	 public void onBackPressed() {
	 	// TODO Auto-generated method stub
	 	 	 	 finish();

	  	}
}
