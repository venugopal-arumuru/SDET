package com.java.oops2;

public class DemoCons {

	private int x, y;
	public DemoCons()
	{
		System.out.println("It is a constructor");
		x = 10;
		y = 20;
	}
	
	void printval()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
	}
}

