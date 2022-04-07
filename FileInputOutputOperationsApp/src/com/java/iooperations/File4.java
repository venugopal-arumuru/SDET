package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File4 {
// reading data from a file using Filereader. 
	public static void main(String[] args) throws Exception 
	{	
		FileReader fr = new FileReader("C:\\WiproFiles\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
		fr.close();
	}
}
