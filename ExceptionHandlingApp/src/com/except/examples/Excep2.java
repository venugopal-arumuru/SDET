package com.except.examples;
import java.util.*;
public class Excep2 {

	public static void main(String[] args) {
		try
		{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two values ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int div = x/y;
		
		System.out.println("Division : " + div);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Value should not divide with zero");
		}
		
		catch(InputMismatchException ie)
		{
			System.out.println("Please enter only integers");
		}
		
		catch(Exception ex)
		{
			System.out.println("Unknown Error!" + ex);
		}
		finally 
		{
			System.out.println("this is finally block");
		}
	}
	
//ArithmeticException
//InputMismatchException
	
}
