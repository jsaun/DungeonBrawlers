package com.example.brawlers;
import com.android.angle.AngleRotatingSprite;
import com.android.angle.AngleSprite;
import com.android.angle.AngleSpriteLayout;


public class ControlStick extends AngleSprite{
	private int x, y;
	
	
	private int radius = 128 / 2;
	
	public ControlStick(int givenX, int givenY, AngleSpriteLayout layout) {
		super(givenX, givenY, layout);
		x = givenX;
		y = givenY + radius;
	}
	
	/*public boolean checkPushed(float givenX, float givenY){
		if(givenX < (x + width/2) && givenX > (x - width/2)){
			if(givenY < (y + height/2) && givenY > (y - height/2)){
				return true;
			}
		}
		return false;
	}*/
	
	public boolean isInCircle(float x, float y){
		float currentX = x - this.x;
		float currentY = y - this.y;
		double distance = Math.sqrt(currentX * currentX + currentY * currentY);
		return distance < radius;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	

}
