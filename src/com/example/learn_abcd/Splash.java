package com.example.learn_abcd;

	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.Window;

	public class Splash extends Activity 
	{

		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			
			
			this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.splash);
		
			Thread splash_thread=new Thread()
			{
				public void run()
				{
					try
					{
						sleep(3000);
					}
					catch (Exception e) 
					{}
					finally
					{
								Intent i=new Intent(Splash.this, MainActivity.class);
								startActivity(i);
								finish();
					}	
				}
			};
			splash_thread.start();
		}
	}



