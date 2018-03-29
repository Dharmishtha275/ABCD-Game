package com.example.learn_abcd;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class set1 extends Activity {

	MediaPlayer mp,mpwin,mploss;
	int i=0;
	String var1;
	public int count = 0,count1=0,Life1=0,Life2=0;
	Button life1, life2,life3,play,da,na;
	int startFrom = 300;
	int endAt = 100;
	TextView point;
	private Handler handler = new Handler();
	int Result;
	Integer letter[] = {R.string.letter_A,R.string.letter_B,R.string.letter_C,R.string.letter_D,R.string.letter_E,
						R.string.letter_F,R.string.letter_G,R.string.letter_H,R.string.letter_I,R.string.letter_J,
						R.string.letter_K,R.string.letter_L,R.string.letter_M,R.string.letter_N
	};

	int[] sounds = {R.raw.a,R.raw.b,R.raw.c,R.raw.d,
					R.raw.e,R.raw.f,R.raw.g,R.raw.h,
					R.raw.i,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,
			};
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Button_Sound.StopSound(set1.this);
		Intent intent = new Intent(set1.this, game.class);
		startActivity(intent);
		super.onBackPressed();
	}

		@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		try {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.set1);



			life1=(Button)findViewById(R.id.btn3);
			life2=(Button)findViewById(R.id.btn2);
			life3=(Button)findViewById(R.id.btn1);

			play=(Button)findViewById(R.id.playback);
			//
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					playNext();
				}
			},1500);


			final Button a = (Button)findViewById(R.id.btna);
			a.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  a.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button b = (Button)findViewById(R.id.btnb);
		b.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  b.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button c = (Button)findViewById(R.id.btnc);
			c.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  c.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button d = (Button)findViewById(R.id.btnd);
			d.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  d.getTag().toString();
					Check_Result(ha1);
				}
			});

			
			final Button e = (Button)findViewById(R.id.btne);
			e.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  e.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button f = (Button)findViewById(R.id.btnf);
			f.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  f.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button g = (Button)findViewById(R.id.btng);
			g.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  g.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button h = (Button)findViewById(R.id.btnh);
			h.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  h.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button i= (Button)findViewById(R.id.btni);
			i.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  i.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button j= (Button)findViewById(R.id.btnj);
			j.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  j.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button k = (Button)findViewById(R.id.btnk);
			k.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  k.getTag().toString();
					Check_Result(ha1);
				}
			});

		
			final Button l = (Button)findViewById(R.id.btnl);
			l.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  l.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button m = (Button)findViewById(R.id.btnm);
			m.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  m.getTag().toString();
					Check_Result(ha1);
				}
			});
			
			
			
			final Button n = (Button)findViewById(R.id.btnn);
		n.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1= n.getTag().toString();
					Check_Result(ha1);
				}
			});

			play.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					//String sound =share.getString(Preferences_Value.CURRENT_fontfamily, null);
					//Toast.makeText(getApplicationContext(), letter[Result], 1000).show();
					Button_Sound.PlaySound(set1.this, Result, sounds);
				}
			});



			mp.setOnCompletionListener(new OnCompletionListener() {

				@Override
				public void onCompletion(MediaPlayer mp) {
					// TODO Auto-generated method stub

				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


		protected void Check_Result(String ha1) {
			// TODO Auto-generated method stub

			String val = getString(letter[Result]);
			if(ha1 == val)
			{
				//right
				Rightpress();
			}
			else
			{
				//No
				removelife();
			}
			if(count1 != 3)
			{
					playNext();
			}
		
		}
		

			public void playNext() 
			{
				
				 new Handler().postDelayed(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							Random r = new Random();
							int Low = 0;
							int High = 13;
							Result = r.nextInt(High-Low) + Low;
								Button_Sound.PlaySound(set1.this, Result, sounds);



						}
					},1500);
					

			}

		public void removelife()
		{
			 mploss = MediaPlayer.create (set1.this,R.raw.s_lifedel);
			count1++;
			if(count1 == 1)
			{
				
				life3.setVisibility(View.GONE);
				 
					mploss.start();
			}
				else if(count1 == 2 )
				{
					life2.setVisibility(View.GONE);
					
						mploss.start();
				}
					else 
					{
						life1.setVisibility(View.GONE);
						
							mploss.start();
						  
						
						
						 final AlertDialog alertDialog = new AlertDialog.Builder(set1.this).create();
						 
						    alertDialog.show();
						    Window win = alertDialog.getWindow();
						    win.setContentView(R.layout.alert_dialoge);
				    
						    TextView score=(TextView)win.findViewById(R.id.score);
						    score.setText("YOUR SCORE IS :" +count);
						    
						   
						    ImageView browser_btn = ( ImageView)win.findViewById(R.id.play);
						    browser_btn.setOnClickListener(new OnClickListener(){
						        @Override
						        public void onClick(View v) {
						            // TODO Auto-generated method stub
						        	Intent i= new Intent(getApplicationContext(),set1.class);
								  startActivity(i);
									  
						        }
						    });

						   
						   
						    ImageView email_btn = ( ImageView)win.findViewById(R.id.home);
						    email_btn.setOnClickListener(new OnClickListener(){
						        @Override
						        public void onClick(View v) {
						            // TODO Auto-generated method stub
						        	Intent i= new Intent(getApplicationContext(),MainActivity.class);
							    	
							    	 startActivity(i);
						        }
						    });
						   
					}
		}
		public void Rightpress() 
		{
			

			count =   count+10;
	         point=(TextView)findViewById(R.id.point);
			point.setText(String.valueOf(count));
			
			List<Integer> soundList = new ArrayList<Integer>();
			soundList.add(R.raw.thats_correct);
			soundList.add(R.raw.excellent);
			soundList.add(R.raw.yupi);
			soundList.add(R.raw.great);

			int randomInt = (new Random().nextInt(soundList.size()));
		    int sound = soundList.get(randomInt);
		    
		    if(mpwin != null)
		    {
		    	mpwin.reset();
		    }
		 mpwin = MediaPlayer.create(this, sound);
		   // mp.seekTo(startFrom);
			mpwin.start();
		
	       }
		
		
		
}