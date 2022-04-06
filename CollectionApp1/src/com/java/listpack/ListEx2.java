package com.java.listpack;
import java.util.*;
public class ListEx2 {

	// searching
	public static void main(String[] args) {
		List<String>  lstStr = new ArrayList<String>();
		lstStr.add("Santhoshi");
		lstStr.add("Abhipreet");
		lstStr.add("Chandana");
		lstStr.add("Yamuna");
		lstStr.add("Jani");
		lstStr.add("Suneel");
		lstStr.add("Yamuna");
		
		System.out.println(lstStr);
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string  to search : ");
		String s = sc.next();
		
		if(lstStr.contains(s))
			System.out.println("It is existed");
		else
			System.out.println("it is not existed");
	}

}
