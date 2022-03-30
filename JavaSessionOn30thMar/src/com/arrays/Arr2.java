package com.arrays;
import java.util.Scanner;
public class Arr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];

		System.out.println("Enter " + x.length + " Values ");		
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		int sum =0;
		System.out.println("Array Values ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "\t");
			sum = sum+x[i];
		}
		System.out.println("\nSum of Array Values : " + sum);
	}

}
