package com.example.brawlers;

import com.android.angle.AngleRotatingSprite;
import com.android.angle.AngleSpriteLayout;

public class CharacterSprite extends AngleSprite{
	{
	
	private Speed speed;
	//private float mAplhaDir;
	//private static final float sAlphaSpeed = 0.5f;

	public CharacterSprite(int x, int y, AngleSpriteLayout layout)
	{
		super(x, y, layout);
		//mAplhaDir=sAlphaSpeed;
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

		mPosition.mX += (speed.getXv() * speed.getxDirection());
		mPosition.mY += (speed.getYv() * speed.getyDirection());
		super.step(secondsElapsed);
	}
	
	
	
}
