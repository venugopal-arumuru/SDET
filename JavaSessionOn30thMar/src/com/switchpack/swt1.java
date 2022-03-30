package com.switchpack;
import java.util.Scanner;
public class swt1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. India\n2. Bhutan\n3. SriLanka");
		System.out.println("Pick your choice : ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Indian Citizen");
			break;
		case 2:
			System.out.println("Bhutan Citizen");
			break;
		case 3:
			System.out.println("Srilanka Citizen");
			break;			
		default:
			System.out.println("Not a valid option");
			break;			
		}
	}

}
