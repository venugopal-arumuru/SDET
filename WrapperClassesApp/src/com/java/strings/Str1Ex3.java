package com.java.strings;
import java.util.Scanner;
public class Str1Ex3 {
// StringBuffer & StringBuilder
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String ");
		sb.append(sc.nextLine());
		System.out.println("Given String : " + sb);
		System.out.println("Upper Case String : " + sb.toString().toUpperCase());
	}
}
