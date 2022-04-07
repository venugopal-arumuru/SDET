package com.java.fileOperations;
import java.util.*;
import java.io.*;
public class ReadWriteOperations {

	public void WriteData(String info) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\WiproFiles\\Demos.txt", true);
		fw.write(info);
		fw.close();
		System.out.println("Data Saved...");
	}
	
	public void ReadData() throws IOException
	{
		FileReader fr = new FileReader("C:\\WiproFiles\\Demos.txt");
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
