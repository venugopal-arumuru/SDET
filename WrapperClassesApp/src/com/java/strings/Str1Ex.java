package com.java.strings;

public class Str1Ex {
// converting a char array into string
	public static void main(String[] args) {
		char ch[] = {'W','i','p','r','o'};
		
		for(char c : ch)
		{
			System.out.print(c + "  ");
		}
		System.out.println();
		
		String str = String.valueOf(ch);
		System.out.println(str);
		
		String str1 = new String(ch);
		System.out.println(str1);
		
		String str2 = "Academy for Best Computer Education";
		System.out.println(str2);
	}
}
