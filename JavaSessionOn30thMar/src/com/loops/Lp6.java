package com.loops;
import java.util.Scanner;
public class Lp6 {
	// accept a number then print it's factorial value
	//  5! = 5x4x3x2x1 = 120
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = sc.nextInt();		
		
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Fact Value is : " + fact);
	}

}
