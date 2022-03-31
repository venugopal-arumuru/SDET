package com.java.oops1;
import java.util.Scanner;
//  accept student marks then print the results
public class Student {	
	private String sname, exam;	
	private int sub1, sub2;
	
	void getStudentInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of student and exam ");
		sname = sc.next();
		exam = sc.next();
		System.out.println("Two Subject Marks ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
	}
	
	void printStdDetails()
	{
		int total = sub1+sub2;
		System.out.println("Total Marks : " + total);
		float avg = total/2.0f;
		System.out.println("Average Marks : " + avg);
		if(sub1>=35 && sub2>=35)
			System.out.println(sname + " is passed");
		else
			System.out.println(sname + " is failed");
	}
}
