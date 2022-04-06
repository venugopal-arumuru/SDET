package com.java.setpack;
import java.util.*;
public class SetEx1 {

	public static void main(String[] args) {

		Set<String>  setStr = new HashSet<String>();
		
		setStr.add("Venugopal");
		setStr.add("Abhiram");
		setStr.add("Bhavani");
		setStr.add("Preethi");
		setStr.add("Krishna");
		setStr.add("Bhavani");
		
		System.out.println(setStr);
		
		for(String s : setStr)
		{
			System.out.println(s);
		}
		
		

	}

}
