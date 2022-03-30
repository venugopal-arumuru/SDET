package com.loops;
import java.util.Scanner;
public class Lp4 {
// bill generation for multiple products
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		do
		{
		
		System.out.println("Product Name ");
		String pname = sc.next();
		
		System.out.println("No of Items ");
		int noi = sc.nextInt();
		
		System.out.println("Price of the Product ");
		float price = sc.nextFloat();
		
		float total = noi*price;
		
		System.out.println("Total Amount : " + total);
		
		System.out.println("1 more product(y/n) ");
		ch = sc.next();
		}
		while(ch.equals("y"));
		System.out.println("Thanks for Shopping ......");
	}

}
