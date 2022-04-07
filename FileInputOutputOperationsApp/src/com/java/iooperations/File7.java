package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File7 {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Folder name : ");
		String fname = sc.next();
		File fileObj = new File("C:\\WiproFiles\\" + fname);
		
		if(fileObj.exists()==true)
			System.out.println("Folder is already exist");
		else
		{
			fileObj.mkdir();
			System.out.println("Folder is Created...");
		}
	}

}
