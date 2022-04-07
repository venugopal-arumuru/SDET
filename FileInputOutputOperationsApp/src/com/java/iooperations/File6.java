package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File6 {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name : ");
		String fname = sc.next();
		File fileObj = new File("C:\\WiproFiles\\" + fname);
		
		if(fileObj.exists()==true)
			System.out.println("File is already exist");
		else
		{
			fileObj.createNewFile();
			System.out.println("File is Created...");
		}
	}

}
