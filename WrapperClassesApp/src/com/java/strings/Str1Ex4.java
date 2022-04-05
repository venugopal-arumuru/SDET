package com.java.strings;

public class Str1Ex4 {
// converting a char array into string
	public static void main(String[] args) {
		String str = "Wipro Java Training";
		System.out.println("String : " + str);
		System.out.println("Upper Case String : " + str.toUpperCase());
		System.out.println("String Length : " + str.length());
		StringBuilder sbr = new StringBuilder("Testing Department");
		System.out.println("String : " + sbr);
		System.out.println("Upper Case String : " + sbr.toString().toUpperCase());
		System.out.println("String Length : " + sbr.length());
		StringBuffer sb = new StringBuffer("Trainer Name : Venugopal");
		System.out.println("String : " + sb);
		
		
	}
}
