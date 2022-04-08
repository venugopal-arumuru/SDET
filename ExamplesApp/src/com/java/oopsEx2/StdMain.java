package com.java.oopsEx2;
import java.util.*;
public class StdMain {

	public static Student getStudentDetails()
	{
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		System.out.println("Student ID : ");
		std.setId(sc.nextInt());
		System.out.println("Student Name : ");
		std.setName(sc.next());
		while(true)
		{
			System.out.println("Enter no of Subjects");
			int n =  sc.nextInt();
			
			if(n<=0)
				System.out.println("Invalid No of Subjects");
			else
			{						
				int tempmarks[] = new int[n];
				for(int i=0;i<tempmarks.length;i++)
				{ 					
					System.out.println("Enter Marks for Subject-" + (i+1));
					tempmarks[i] = sc.nextInt();					 
				}
				std.setMarks(tempmarks);
				break;
			}
		}
			
		return std;
	}
	
	
	public static void main(String[] args) {
		Student stdinfo = StdMain.getStudentDetails();
		stdinfo.calculateAvg();
		stdinfo.findGrade();
		
		System.out.println("ID : " + stdinfo.getId());
		System.out.println("Name : " + stdinfo.getName());
		System.out.println("Average : " + stdinfo.getAverage());
		System.out.println("Grade : " + stdinfo.getGrade());
	}

}
