package com.example.brawlers;

public class Speed {
	public static final int DIRECTION_RIGHT = 1;
	public static final int DIRECTION_LEFT = -1;
	public static final int DIRECTION_UP = -1;
	public static final int DIRECTION_DOWN = 1;
	
	private float xv = 2; //velocity in the X direction
	private float yv = 2; //velocity in the Y direction
	
	private int xDirection = DIRECTION_RIGHT;
	private int yDirection = DIRECTION_DOWN;

	public Speed(){
		xv = 2;
		yv = 2;
	}
	
	public Speed(float givenXv, float givenYv){
		xv = givenXv;
		yv = givenYv;
	}
	
	public float getXv(){
		return xv;
	}
	
	public void setXv(float newXv){
		xv =  newXv;
	}
	
	public float getYv(){
		return yv;
	}
	
	public void setYv(float newYv){
		yv = newYv;
	}
	
	public int getxDirection(){
		return xDirection;
	}
	
	public void setxDirection(int newDirection){
		xDirection = newDirection;
	}
	
	public int getyDirection(){
		return yDirection;
	}
	
	public void setyDirection(int newDirection){
		yDirection = newDirection;
	}
	
	public void toggleXDirection(){
		xDirection = xDirection * -1;
	}
	
	public void toggleYDirection(){
		yDirection = yDirection * -1;
	}
	
	
}
