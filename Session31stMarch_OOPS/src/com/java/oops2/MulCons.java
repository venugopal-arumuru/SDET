package com.java.oops2;

public class MulCons {

	private int x, y;
	public MulCons()
	{
		System.out.println("It is a constructor");
		x = 10;
		y = 20;
	}
	
	public MulCons(int x, int y)
	{
		System.out.println("It is a constructor with parameters");
		this.x = x;
		this.y = y;
	}
	
	void printval()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
	}
}

