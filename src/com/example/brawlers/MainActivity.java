package com.example.brawlers;

import com.android.angle.AngleActivity;


import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import com.android.angle.AngleSpriteLayout;
import com.android.angle.AngleUI;
import com.android.angle.FPSCounter;

public class MainActivity extends AngleActivity {
	int stickX = 75;
	int stickY = 325;

	
	
	private class Demo extends AngleUI
	{
		AngleSpriteLayout mLogoLayout, buttonLayout;
		ControlStick stick1;
		AnimatedSprite sprite;
		
		
		
		public Demo (AngleActivity activity)
		{
			super(activity);
			mLogoLayout = new AngleSpriteLayout(mGLSurfaceView, R.drawable.anglelogo);
			sprite = new AnimatedSprite (150, 100, mLogoLayout);
			mActivity.mGLSurfaceView.addObject(sprite);
			
			buttonLayout = new AngleSpriteLayout(mGLSurfaceView, R.drawable.ball);
			stick1 = new ControlStick(stickX, stickY, buttonLayout);
			mActivity.mGLSurfaceView.addObject(stick1);
		}
		
		@Override
		public void step(float secondsElapsed)
		{
			super.step(secondsElapsed);
			
			
		}
		

		@Override
		public boolean onTouchEvent(MotionEvent event)
		{
			if (event.getAction()==MotionEvent.ACTION_DOWN)
			{
				if(stick1.isInCircle(event.getX(), event.getY())){
					sprite.setSpeed(new Speed(event.getX() - stick1.getX(), event.getY() - stick1.getY()));
				}
				
			}
			else if(event.getAction()==MotionEvent.ACTION_MOVE){
				if(stick1.isInCircle(event.getX(), event.getY())){
					sprite.setSpeed(new Speed(event.getX() - stick1.getX(), event.getY() - stick1.getY()));
				}else sprite.setSpeed(new Speed(0,0));
			}
			else if(event.getAction() == MotionEvent.ACTION_UP){
				sprite.setSpeed(new Speed(0,0));
			}
			return super.onTouchEvent(event);
		}
		
	};
	
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		mGLSurfaceView.addObject(new FPSCounter());

		FrameLayout mMainLayout=new FrameLayout(this);
		mMainLayout.addView(mGLSurfaceView);
		setContentView(mMainLayout);
		
		setUI(new Demo(this));
	}
	
	
}
