package com.example.brawlers;

import com.android.angle.AngleRotatingSprite;
import com.android.angle.AngleSpriteLayout;

public class AnimatedSprite extends AngleRotatingSprite{

	private static final float sRotationSpeed = 20;
	private static final float sAlphaSpeed = 0.5f;
	private float mAplhaDir;
	
	private Speed speed;

	public AnimatedSprite(int x, int y, AngleSpriteLayout layout)
	{
		super(x, y, layout);
		mAplhaDir=sAlphaSpeed;
		speed = new Speed(0,0);
	}
	
	public void setX(float givenX){
		super.mPosition.mX = givenX;
	}
	
	public void setY(float givenY){
		super.mPosition.mY = givenY;
	}
	
	public Speed getSpeed(){
		return speed;
	}
	
	public void setSpeed(Speed newSpeed){
		speed = newSpeed;
	}

	@Override
	public void step(float secondsElapsed)
	{
		mRotation+=secondsElapsed*sRotationSpeed;
		mAlpha+=secondsElapsed*mAplhaDir;
		if (mAlpha>1)
		{
			mAlpha=1;
			mAplhaDir=-sAlphaSpeed;
		}
		if (mAlpha<0)
		{
			mAlpha=0;
			mAplhaDir=sAlphaSpeed;
		}
		mPosition.mX += (speed.getXv() * speed.getxDirection()/20);
		mPosition.mY += (speed.getYv() * speed.getyDirection()/20);
		super.step(secondsElapsed);
	}
	
	
	
}
