package com.java.oops1;

public class DemoStatic {

	private static int x, y;
	
	static void getdata()
	{
		x = 10;
		y = 20;
	
	}
	
	static void putdata()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		int add = x+y; 
		System.out.println("add val : " + add);
	}
}
