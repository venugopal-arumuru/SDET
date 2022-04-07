package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File2 {
// reading data from a file using binary format. 
	public static void main(String[] args) throws Exception 
	{	
		FileInputStream fis = new FileInputStream("C:\\WiproFiles\\abc.txt");
		//FileInputStream fis = new FileInputStream("C:\\WiproJavaTesting\\FileInputOutputOperationsApp\\src\\com\\java\\iooperations\\File2.java");
		
		int ch = fis.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fis.read();
		}
		fis.close();
	}

}
