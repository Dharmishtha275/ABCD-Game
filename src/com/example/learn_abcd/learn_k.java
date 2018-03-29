package com.example.learn_abcd;



import android.R.layout;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class learn_k extends Activity{

	Button o,p,q,r,s,t,u,v,w,x,y,z;
	private MediaPlayer mp;
	ImageView img;
	Animation zoomin;
	Animation zoomout ;
	String value;
	RelativeLayout l1;
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(learn_k.this, MainActivity.class);
		startActivity(intent);
		super.onBackPressed();
	}




	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.learn_k);
		try {

			img=(ImageView)findViewById(R.id.image);
			img.bringToFront();
			l1=(RelativeLayout)findViewById(R.id.mainimglayout);

			img = (ImageView) findViewById(R.id.image);

		 

			o = (Button)findViewById(R.id.btno);
			o.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String na20= o.getTag().toString();
					zoomeffect(na20);
				}
			});

			p = (Button)findViewById(R.id.btnp);
			p.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ta10= p.getTag().toString();
					zoomeffect(ta10);
				}
			});

			q = (Button)findViewById(R.id.btnq);
			q.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String tha10= q.getTag().toString();
					zoomeffect(tha10);
				}
			});

			r= (Button)findViewById(R.id.btnr);
			r.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String da10= r.getTag().toString();
					zoomeffect(da10);
				}
			});

			s = (Button)findViewById(R.id.btns);
			s.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String dha10= s.getTag().toString();
					zoomeffect(dha10);
				}
			});

		t= (Button)findViewById(R.id.btnt);
			t.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String na40= t.getTag().toString();
					zoomeffect(na40);
				}
			});

			u=(Button)findViewById(R.id.btnu);
			u.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String pa1= u.getTag().toString();
					zoomeffect(pa1);
				}
			});

			v=(Button)findViewById(R.id.btnv);
			v.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String pha1= v.getTag().toString();
					zoomeffect(pha1);
				}
			});

			w=(Button)findViewById(R.id.btnw);
			w.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ba1= w.getTag().toString();
					zoomeffect(ba1);
				}
			});

			x=(Button)findViewById(R.id.btnx);
			x.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String bha1= x.getTag().toString();
					zoomeffect(bha1);
				}
			});

			y=(Button)findViewById(R.id.btny);
			y.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ma1= y.getTag().toString();
					zoomeffect(ma1);
				}
			});

			z=(Button)findViewById(R.id.btnz);
			z.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ya1= z.getTag().toString();
					zoomeffect(ya1);
				}
			});

			

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	private void zoomeffect(String value) {

	
		if( value == getString(R.string.letter_O))
		{
			img.setImageResource(R.drawable.o);
			mp = MediaPlayer.create(learn_k.this, R.raw.o);
		}
		
		if( value == getString(R.string.letter_P))
		{
			img.setImageResource(R.drawable.p1);
			mp = MediaPlayer.create(learn_k.this, R.raw.p);
		}
		
		if( value == getString(R.string.letter_Q))
		{
			img.setImageResource(R.drawable.q1);
			mp = MediaPlayer.create(learn_k.this, R.raw.q);
		}
		
		if( value == getString(R.string.letter_R))
		{
			img.setImageResource(R.drawable.r1);
			mp = MediaPlayer.create(learn_k.this, R.raw.r);
		}
		
		if( value == getString(R.string.letter_S))
		{
			img.setImageResource(R.drawable.s1);
			mp = MediaPlayer.create(learn_k.this, R.raw.s);
		}
		
		if( value == getString(R.string.letter_T))
		{
			img.setImageResource(R.drawable.t1);
			mp = MediaPlayer.create(learn_k.this, R.raw.t);
		}
		
		if( value == getString(R.string.letter_U))
		{
			img.setImageResource(R.drawable.u1);
			mp = MediaPlayer.create(learn_k.this, R.raw.u);
		}
		
		if( value == getString(R.string.letter_V))
		{
			img.setImageResource(R.drawable.v1);
			mp = MediaPlayer.create(learn_k.this, R.raw.v);
		}
		
		if( value == getString(R.string.letter_W))
		{
			img.setImageResource(R.drawable.w1);
			mp = MediaPlayer.create(learn_k.this, R.raw.w);
		}
		
		if( value == getString(R.string.letter_X))
		{
			img.setImageResource(R.drawable.x1);
			mp = MediaPlayer.create(learn_k.this, R.raw.x);
		}
		
		if( value == getString(R.string.letter_Y))
		{
			img.setImageResource(R.drawable.y1);
			mp = MediaPlayer.create(learn_k.this, R.raw.y);
		}
		if( value == getString(R.string.letter_Z))
		{
			img.setImageResource(R.drawable.z1);
			mp = MediaPlayer.create(learn_k.this, R.raw.z);
		}
		
		
		mp.start();

		zoomin	 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
		zoomout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);

		img.setVisibility(View.VISIBLE);
		l1.setVisibility(View.VISIBLE);
		l1.bringToFront();
		zoomout.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {


			}

			@Override
			public void onAnimationEnd(Animation animation) {
				img.setVisibility(View.GONE);
				l1.setVisibility(View.GONE);
			}

			@Override
			public void onAnimationRepeat(Animation arg0) {
				img.setVisibility(View.GONE);
				l1.setVisibility(View.GONE);
			}
		});

		img.startAnimation(zoomin);  
		img.startAnimation(zoomout);



	}



	private void stopPlaying() {
		if (mp != null) {
			mp.stop();
			mp.release();
			mp = null;
		}
	}
}

