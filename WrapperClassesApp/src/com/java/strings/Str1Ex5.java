package com.java.strings;
import java.util.*;
public class Str1Ex5 {
//Pan Card Validation
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pan Card Number ");
		String str = sc.next();
		
		int ch = 0, dg=0;		
		if(str.length()!=10)
		{
			System.out.println("Invalid Pan Number ");	
			System.exit(0);
		}
		else if(!(str.charAt(str.length()-1)>='A' && str.charAt(str.length()-1)<='Z'))
		{
			System.out.println("Invalid Pan Number ");
			System.exit(0);
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char c = str.charAt(i);
				if(c>='A' && c<='Z')
					ch++;
				else if(c>='1' && c<='9')
					dg++;
			}
		}
		
		if(ch==6 && dg==4)
			System.out.println("Valid");
		else
			System.out.println("Invalid ");
	}
}
