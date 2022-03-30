package com.switchpack;
import java.util.Scanner;
public class swt2 {
// accept month number then print no of days in a month
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter month number(1-12) : ");
		int mno = sc.nextInt();
		
		switch(mno)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Month having 31 days");
			break;
		case 2:
			System.out.println("Month having 28/29 days");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("Month having 30 days ");
			break;					
		default:
			System.out.println("Not a valid option");
			break;			
		}
	}

}
