package com.except.examples;

import java.io.IOException;

public class Excep4 {

	public static void main(String[] args)  {
		try
		{
		System.out.println("Enter an alphabet : ");
		int ch = System.in.read();
		System.out.println("Given Character : " + (char)ch);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

//System.in.read() :- this method read's a characters from keyboard and returns it's
// ascii value. 
//A = 65