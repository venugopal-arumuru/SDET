package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File1 {
// writeting data into a file using binary format. 
	public static void main(String[] args) throws Exception 
	{	
		FileOutputStream fos = new FileOutputStream("C:\\WiproFiles\\abc.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Some text : ");
		String str = sc.nextLine();
		
		byte arr[] = str.getBytes();  // converting string into bits and bytes
		
		fos.write(arr);  // writing data into a file.
		
		fos.close();
		System.out.println("Data has been saved into a file....");
	}

}
