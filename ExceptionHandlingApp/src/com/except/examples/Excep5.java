package com.except.examples;
import java.util.*;
import java.io.IOException;

public class Excep5 {

	public static void main(String[] args)  {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age of the person : ");
			int age = sc.nextInt();
			if(age>=18)
				System.out.println("Eligible for voting");
			else
				throw new InvalidAgeException("Error! voter age not sufficient");
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

//System.in.read() :- this method read's a characters from keyboard and returns it's
// ascii value. 
//A = 65