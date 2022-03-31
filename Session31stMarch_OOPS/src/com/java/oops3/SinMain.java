package com.java.oops3;

class DemoParent
{
	protected int x, y;
	
	void getdata(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class DemoChild  extends DemoParent
{	
	private int sum;
	
	void putdata()
	{
		sum = x+y;
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		System.out.println("Addition : " + sum);
	}
}

public class SinMain {

	public static void main(String[] args) {
		DemoChild dc = new DemoChild();
		dc.getdata(10, 20);
		dc.putdata();
	}

}
