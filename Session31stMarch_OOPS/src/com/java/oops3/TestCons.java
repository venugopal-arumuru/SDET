package com.java.oops3;

class Demo1
{
	Demo1()
	{
		System.out.println("Parent Class Cons");
	}
}

class Demo2 extends Demo1
{
	Demo2()
	{
		super();
		System.out.println("child Class Cons");
	}
	void test()
	{
		System.out.println("Test Method");
	}
}

public class TestCons {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.test();

	}

}
