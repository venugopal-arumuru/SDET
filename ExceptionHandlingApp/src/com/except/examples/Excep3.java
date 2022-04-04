package com.except.examples;

import java.io.IOException;

public class Excep3 {

	public static void main(String[] args) throws Exception {		
		System.out.println("Enter an alphabet : ");
		int ch = System.in.read();
		System.out.println("Given Character : " + (char)ch);
	}
}

//System.in.read() :- this method read's a characters from keyboard and returns it's
// ascii value. 
//A = 65