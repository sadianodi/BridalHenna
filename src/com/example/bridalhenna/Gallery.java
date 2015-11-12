package com.example.bridalhenna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Gallery extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gallery);
		Button own=(Button)findViewById(R.id.own);
		//Button about=(Button)findViewById(R.id.about);
		//Button niom=(Button)findViewById(R.id.niom);
		
		
		
		own.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Gallery.this,ViewPagerExampleActivity.class);
				startActivity(i);
				
			}
		});
	}

}
