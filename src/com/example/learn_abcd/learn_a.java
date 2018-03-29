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

public class learn_a extends Activity{

	Button a,b,c,d,e,f,g,h,i,j,k,l,m,n;
	private MediaPlayer mp;
	ImageView img;
	Animation zoomin;
	Animation zoomout ;
	String value;
	RelativeLayout l1;
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(learn_a.this, MainActivity.class);
		startActivity(intent);
		super.onBackPressed();
	}




	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.learn_a);
		try {

			img=(ImageView)findViewById(R.id.image);
			img.bringToFront();
			l1=(RelativeLayout)findViewById(R.id.mainimglayout);

			img = (ImageView) findViewById(R.id.image);

		  a=(Button)findViewById(R.id.btna);
			a.setOnClickListener(new OnClickListener() {


				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 stopPlaying();
					 
					 String a1= a.getTag().toString();
					  zoomeffect(a1);	
				}
			});


			b=(Button)findViewById(R.id.btnb);
			b.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String kh1= b.getTag().toString();
					zoomeffect(kh1);
				}
			});

			c=(Button)findViewById(R.id.btnc);
			c.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub	
					stopPlaying();
					String ga1= c.getTag().toString();
					zoomeffect(ga1);
				}
			});

			d=(Button)findViewById(R.id.btnd);
			d.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String gha1= d.getTag().toString();
					zoomeffect(gha1);
				}
			});


			e=(Button)findViewById(R.id.btne);
			e.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String na1= e.getTag().toString();
					zoomeffect(na1);
				}
			});


			f=(Button)findViewById(R.id.btnf);
			f.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ca1= f.getTag().toString();
					zoomeffect(ca1);
				}
			});

			g=(Button)findViewById(R.id.btng);
			g.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String cha1= g.getTag().toString();
					zoomeffect(cha1);
				}
			});

			h=(Button)findViewById(R.id.btnh);
			h.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ja1= h.getTag().toString();
					zoomeffect(ja1);
				}
			});

			i=(Button)findViewById(R.id.btni);
			i.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String jha1= i.getTag().toString();
					zoomeffect(jha1);
				}
			});

			  j= (Button)findViewById(R.id.btnj);
			j.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String na10= j.getTag().toString();
					zoomeffect(na10);
				}
			});

			k=(Button)findViewById(R.id.btnk);
			k.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String ta1= k.getTag().toString();
					zoomeffect(ta1);
				}
			});

			l=(Button)findViewById(R.id.btnl);
			l.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String tha1= l.getTag().toString();
					zoomeffect(tha1);
				}
			});

			m=(Button)findViewById(R.id.btnm);
			m.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String da1= m.getTag().toString();
					zoomeffect(da1);
				}
			});

			n=(Button)findViewById(R.id.btnn);
			n.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					stopPlaying();
					String dha1= n.getTag().toString();
					zoomeffect(dha1);
				}
			});

			

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	private void zoomeffect(String value) {

		if( value == getString(R.string.letter_A))
		{
			img.setImageResource(R.drawable.a);
			mp = MediaPlayer.create(learn_a.this, R.raw.a);
		}
		
		if( value == getString(R.string.letter_B))
		{
			img.setImageResource(R.drawable.b1);
			mp = MediaPlayer.create(learn_a.this, R.raw.b);
		}
		
		if( value == getString(R.string.letter_C))
		{
			img.setImageResource(R.drawable.c1);
			mp = MediaPlayer.create(learn_a.this,  R.raw.c);
		}
		
		if( value == getString(R.string.letter_D))
		{
			img.setImageResource(R.drawable.d1);
			mp = MediaPlayer.create(learn_a.this, R.raw.d);
		}
		
		if( value == getString(R.string.letter_E))
		{
			img.setImageResource(R.drawable.e1);
			mp = MediaPlayer.create(learn_a.this, R.raw.e);
		}
		
		if( value == getString(R.string.letter_F))
		{
			img.setImageResource(R.drawable.f1);
			mp = MediaPlayer.create(learn_a.this, R.raw.f);
		}
		
		if( value == getString(R.string.letter_G))
		{
			img.setImageResource(R.drawable.g1);
			mp = MediaPlayer.create(learn_a.this, R.raw.g);
		}
		
		if( value == getString(R.string.letter_H))
		{
			img.setImageResource(R.drawable.h1);
			mp = MediaPlayer.create(learn_a.this, R.raw.h);
		}
		
		if( value == getString(R.string.letter_I))
		{
			img.setImageResource(R.drawable.i);
			mp = MediaPlayer.create(learn_a.this, R.raw.i);
		}
		
		if( value == getString(R.string.letter_J))
		{
			img.setImageResource(R.drawable.j1);
			mp = MediaPlayer.create(learn_a.this, R.raw.j);
		}
		
		if( value == getString(R.string.letter_K))
		{
			img.setImageResource(R.drawable.k1);
			mp = MediaPlayer.create(learn_a.this, R.raw.k);
		}
		
		if( value == getString(R.string.letter_L))
		{
			img.setImageResource(R.drawable.l1);
			mp = MediaPlayer.create(learn_a.this, R.raw.l);
		}
		
		if( value == getString(R.string.letter_M))
		{
			img.setImageResource(R.drawable.m);
			mp = MediaPlayer.create(learn_a.this, R.raw.m);
		}
		
		if( value == getString(R.string.letter_N))
		{
			img.setImageResource(R.drawable.n);
			mp = MediaPlayer.create(learn_a.this, R.raw.n);
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

