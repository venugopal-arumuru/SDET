package com.java.wrapper;
import java.util.*;

public class Wrapper3 {
	// Unboxing 
	public static void main(String[] args) {	
		String str = "100";
		int x = Integer.parseInt(str);
		System.out.println("X value is : " + x);
		String st1 = "100.45";
		float y = Float.parseFloat(st1);		
		System.out.println("Y value is : " + y);
		String st2 = "A";
		char ch = st2.charAt(0);
		System.out.println("Ch value is : " + ch);
	}
}
