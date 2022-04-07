package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File5 {
// writing formated data(Emp Info) into a file using Filewriter(character format) 
	public static void main(String[] args) throws Exception 
	{				
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Employee Number ");
		int eno = sc.nextInt();
		System.out.println("Employee Name : ");
		String ename = sc.next();
		System.out.println("Employee Job : ");
		String job = sc.next();
		System.out.println("Employee Salary ");
		int sal = sc.nextInt();
		FileWriter fw = new FileWriter("C:\\WiproFiles\\Emp.txt", true);
		String result =  eno + "\t" + ename + "\t" + job + "\t" + sal + "\n";		
		fw.write(result);  // writing data into a file.		
		fw.close();
		System.out.println("1 more employee (1/0)");
		int ch = sc.nextInt();
		if(ch==0)
			break;
		}
		while(true);
		System.out.println("All Emp info stored in a file.");
	}
}
