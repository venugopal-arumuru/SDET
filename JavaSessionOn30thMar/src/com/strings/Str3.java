package com.strings;
import java.util.Scanner;
public class Str3 {
// accept two strings then cehck those string are equal or not.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings : ");
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(str1.equals(str2)==true)
			System.out.println("Both are equals");
		else
			System.out.println("Both are in-equals");		
	}

}
