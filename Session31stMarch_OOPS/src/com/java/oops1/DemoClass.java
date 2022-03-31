package com.java.oops1;

public class DemoClass {

	private int x, y;  // data members : these are used in every method of the class. 
	
	public void getdata()
	{
		x = 10;
		y = 20;
	}
	
	public void putdata()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		int add = x+y; // here "add" is a local variable which can be used only in this method.
		System.out.println("add val : " + add);
	}
}
