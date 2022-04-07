package com.java.fileOperations;
import java.io.*;
public class TestApp1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		ReadWriteOperations rw = new ReadWriteOperations();
		
		while(true) {
		System.out.println("1. Write Data\n2. Read Data\n3. Exit");
		int ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1:
			System.out.println("Enter Some Text : ");
			String s = br.readLine();
			rw.WriteData(s);
			break;
		case 2:
			rw.ReadData();
			break;
		case 3:
			System.out.println("Thanks for using this app");
			System.exit(0);
		}
		}

	}

}
