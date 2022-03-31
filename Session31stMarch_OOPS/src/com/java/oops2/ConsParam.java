package com.java.oops2;

public class ConsParam {
	private int x,y;
	
	ConsParam(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Parameterized Constructor");
	}
	
	void printval()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
	}
}
