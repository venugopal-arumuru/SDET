package com.arrays;
import java.util.Scanner;
public class Arr4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int x[][] = new int[3][3];
		System.out.println("Enter 9 values ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j] = sc.nextInt();
			}		
		}
		int sum =0;
		System.out.println("Array Values ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j] + "\t");
				if(i==j)
					sum =sum+x[i][j];
			}
			System.out.println();
		}
	
		System.out.println("Sum of diagonal elements : "  + sum);
	}
}
