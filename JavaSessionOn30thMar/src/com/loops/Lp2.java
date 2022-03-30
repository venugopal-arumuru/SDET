package com.loops;
public class Lp2 {
// print all even numbers b/w 1-20 vice versa
	// 2 4 6 8 10 12, ....
	public static void main(String[] args) {
		System.out.println("Even numbers b/w 1-20");
		int x = 2;
		while(x<=20)
		{
			System.out.print(x + "  ");
			x=x+2;
		}
		System.out.println("\nEven numbers b/w 20-1");
		x=20;
		while(x>=1)
		{
			System.out.print(x + "  ");
			x=x-2;
		}		
	}
}
