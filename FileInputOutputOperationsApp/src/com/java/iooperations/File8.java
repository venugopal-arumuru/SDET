package com.java.iooperations;
import java.util.*;
import java.io.*;
public class File8 {

	public static void main(String[] args) throws Exception 
	{			
		File fileObj = new File("C:\\WiproFiles");
		String finfo[] = fileObj.list();
		int fcount=0, dcount=0;
		for(String f : finfo)
		{
			File  temp = new File("C:\\WiproFiles\\" + f);
			if(temp.isFile()==true)
				fcount++;
			if(temp.isDirectory()==true)
				dcount++;
			System.out.println(f);
		}
		System.out.println("No of Files : " + fcount);
		System.out.println("No of Folders : " + dcount);
	}

}
