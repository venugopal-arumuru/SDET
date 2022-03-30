package com.loops;

public class nslp2 {

	public static void main(String[] args) {

		/*
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 */
		
		int n=1;
		while(n<=3)
		{
			int m=1;
			while(m<=3)
			{
				System.out.print(m + "  ");
				m++;
			}
			n++;
			System.out.println();
		}
			
		System.out.println("----------------");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j + "  ");				
			}			
			System.out.println();
		}

	}

}
