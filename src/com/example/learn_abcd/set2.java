package com.example.learn_abcd;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class set2 extends Activity {

	private static final Context Context = null;
	Timer timer;
	MediaPlayer mp,mpwin,mp2;
	int i=0;
	String var1;
	int startFrom = 300;
	int endAt = 100;
	public int count = 0,count1=0,Life1=0,Life2=0;
	Button life1, life2,life3,play;
	int Result;
	private Handler handler = new Handler();
	 TextView point;
	Integer letter[] = {R.string.letter_O,R.string.letter_P,R.string.letter_Q,R.string.letter_R,
						R.string.letter_S,R.string.letter_T,R.string.letter_U,R.string.letter_V,
						R.string.letter_W,R.string.letter_X,R.string.letter_Y,R.string.letter_Z,
			};
			
	
	
	int[] sounds = {R.raw.o, R.raw.p, R.raw.q,R.raw.r,
					R.raw.s,R.raw.t,R.raw.u,R.raw.v,
					R.raw.w,R.raw.x,R.raw.y,R.raw.z,
					};
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Button_Sound.StopSound(set2.this);
		Intent intent = new Intent(set2.this, game.class);
	    startActivity(intent);
	  super.onBackPressed();
	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		try {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.set2);

			life1=(Button)findViewById(R.id.btn3);
			life2=(Button)findViewById(R.id.btn2);
			life3=(Button)findViewById(R.id.btn1);
			play=(Button)findViewById(R.id.playback);
			
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					playNext();
				}
			},1500);

			
			play.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					//Toast.makeText(getApplicationContext(), letter[Result], 1000).show();
					Button_Sound.PlaySound(set2.this, Result, sounds);
				}
			});  
			
			final Button o = (Button)findViewById(R.id.btno);
			o.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  o.getTag().toString();
					Check_Result(ha1);
				}
			});
			
			final Button p = (Button)findViewById(R.id.btnp);
			p.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  p.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button q = (Button)findViewById(R.id.btnq);
			q.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  q.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button r = (Button)findViewById(R.id.btnr);
			r.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  r.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button s = (Button)findViewById(R.id.btns);
			s.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1= s.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button t = (Button)findViewById(R.id.btnt);
			t.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  t.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button u = (Button)findViewById(R.id.btnu);
			u.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  u.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button v = (Button)findViewById(R.id.btnv);
			v.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  v.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button w = (Button)findViewById(R.id.btnw);
			w.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  w.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button x = (Button)findViewById(R.id.btnx);
			x.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1= x.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button y = (Button)findViewById(R.id.btny);
			y.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  y.getTag().toString();
					Check_Result(ha1);
				}
			});

			final Button z = (Button)findViewById(R.id.btnz);
		z.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String ha1=  z.getTag().toString();
					Check_Result(ha1);
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
						int High = 11;
						Result = r.nextInt(High-Low) + Low;
						Button_Sound.PlaySound(set2.this, Result, sounds);



					}
				},1500);
				

		}

	public void removelife()
	{
		 mp2 = MediaPlayer.create (set2.this,R.raw.s_lifedel);
		count1++;
		if(count1 == 1)
		{
			
			life3.setVisibility(View.GONE);
			 
				mp2.start();
		}
			else if(count1 == 2 )
			{
				life2.setVisibility(View.GONE);
				
					mp2.start();
			}
				else 
				{
					life1.setVisibility(View.GONE);
					
						mp2.start();
					  
					
					
					 final AlertDialog alertDialog = new AlertDialog.Builder(set2.this).create();
					 
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
					        	Intent i= new Intent(getApplicationContext(),set2.class);
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
		soundList.add(R.raw.t);
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
