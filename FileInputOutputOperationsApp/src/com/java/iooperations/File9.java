package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File9 {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name : ");
		String fname = sc.next();
		File fileObj = new File("C:\\WiproFiles\\" + fname);
		
		if(fileObj.exists()==true)
		{
			fileObj.delete();
			System.out.println("File Deleted");
		}
		else
		{			
			System.out.println("File is Not Found...");
		}
	}

}
