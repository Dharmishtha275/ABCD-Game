package com.example.learn_abcd;


import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;



public class Button_Sound {

	MediaPlayer mp1;
	static MediaPlayer button_click;
	public static void PlaySound(Context context, int result, int[] sounds)
	{
	
		button_click = MediaPlayer.create(context,sounds[result]);
		
		button_click.start();
		button_click.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				mp.release();

			};
		});
	}
	private static String getString(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void StopSound(Context context) {
		try {
			   if (button_click != null) {
		            button_click.stop();
		            button_click.release();
		            button_click = null;
		       }
		} catch (Exception e) {
			// TODO: handle exception
		}
	 
	}

}
