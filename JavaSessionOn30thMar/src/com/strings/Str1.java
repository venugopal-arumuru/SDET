package com.strings;

public class Str1 {

	public static void main(String[] args) {
	
		String str = "Academy for Best Computer Education";
		System.out.println("Given String : " + str);
		System.out.println("Upper Case String : " + str.toUpperCase());
		System.out.println("Lower Case String : " + str.toLowerCase());
		System.out.println("Length of the String : " + str.length());

		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i) + " " );
		}
		
	}

}
