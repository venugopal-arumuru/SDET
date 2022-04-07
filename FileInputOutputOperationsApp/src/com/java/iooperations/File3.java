package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File3 {
// writing data into a file using Filewriter(character format) 
	public static void main(String[] args) throws Exception 
	{	
		FileWriter fw = new FileWriter("C:\\WiproFiles\\demo.txt", true);		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Some text : ");
		String str = sc.nextLine();
		str = "\n" + str;
		fw.write(str);  // writing data into a file.
		
		fw.close();
		System.out.println("Data has been saved into a file....");
	}
}
