package com.arrays;
import java.util.Scanner;
public class Arr5 {

	// Accept set of values into an array, then search a value from array.
	
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
					
		System.out.println("Array Values ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j] + "\t");
				
			}
			System.out.println();
		}
	
		System.out.println("Enter a value to search : ");
		int n = sc.nextInt();
		
		boolean chkr = false;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(x[i][j]==n)
					chkr = true;
			}			
		}
		
		if(chkr==true)
			System.out.println("Value is Existed");
		else
			System.out.println("Value is not Existed");
	}
}
