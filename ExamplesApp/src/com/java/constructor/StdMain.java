package com.java.constructor;
import java.util.*;
public class StdMain {

	public static void main(String[] args) {
		Student std = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sname = sc.next();
		System.out.println("Enter Student Address : ");
		String adrs = sc.next();
		while(true)
		{
			System.out.println("Whether the student is from NIT(Yes/No) : ");
			String chk = sc.next();
			if(chk.equals("Yes") || chk.equals("No"))
			{
				if(chk.equals("No"))
				{
					System.out.println("Enter Student College : ");
					String clgName = sc.next();			
					std = new Student(sid, sname, adrs, clgName);
				}
				else
				{
					std = new Student(sid, sname, adrs);
				}	
				break;
			}
			else
				System.out.println("Wrong Input");
		}
		System.out.println("Student ID : " + std.getStudentId());
		System.out.println("Student Name : " + std.getStudentName());
		System.out.println("Address : " + std.getStudentAddress());
		System.out.println("College name : " + std.getCollegeName());
	}

}
