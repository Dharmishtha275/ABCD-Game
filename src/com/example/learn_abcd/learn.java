package com.example.learn_abcd;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.media.MediaPlayer;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class learn  extends Activity {
	
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(learn.this, MainActivity.class);
	    startActivity(intent);
	   // finish();
		super.onBackPressed();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.learn);

		
		Button play1= (Button)findViewById(R.id.play1);
		play1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				 
				Intent i= new Intent(getApplicationContext(),learn_a.class);
			  startActivity(i);
					
				
			}
				
		});
	
	
	
	Button play2= (Button)findViewById(R.id.play2);
	play2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		
			 
			Intent i= new Intent(getApplicationContext(),learn_k.class);
		  startActivity(i);
				
			
		}
			
	});


	

}
}	
	
	
	
		

	