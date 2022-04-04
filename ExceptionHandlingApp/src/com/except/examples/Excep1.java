package com.except.examples;
import java.util.*;
public class Excep1 {

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
		catch(Exception ex)
		{
			System.out.println("Value should not divide with zero");
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}
	
//ArithmeticException
//InputMismatchException
	
}
