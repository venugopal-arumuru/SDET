package com.strings;

import java.util.Arrays;

public class Str4 {

	public static void main(String[] args) {
	
		String  str[] = {"Wipro", "Testing", "Academy", "Java Training"};
		System.out.println("Before Sorting\n------------------");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		Arrays.sort(str);
		
		System.out.println("After Sorting\n--------------");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}		
	}

}
