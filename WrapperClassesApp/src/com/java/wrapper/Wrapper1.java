package com.java.wrapper;
import java.util.*;

public class Wrapper1 {
	// Autoboxing 
	public static void main(String[] args) {
		int x = 10;
		Integer n = x;
		System.out.println("X value is : " + x);
		System.out.println("N value is : " + n);
		Integer y = Integer.valueOf(x);  // older version
		System.out.println("Y value is : " + y);
	}
}
