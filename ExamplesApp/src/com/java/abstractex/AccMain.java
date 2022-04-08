package com.java.abstractex;
import java.util.*;
public class AccMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cus ID : ");
		int cid = sc.nextInt();
		System.out.println("Customer Name ");
		String cn = sc.next();
		System.out.println("Customer Mail ID ");
		String email = sc.next();
		Customer cusObj = new Customer(cid, cn, email);
		System.out.println("Account Number : ");
		int ano = sc.nextInt();
		System.out.println("Balance : ");
		double bal = sc.nextDouble();
		
		SavingsAccount  sa = new SavingsAccount(ano, cusObj, bal, 5000.00);
		
		System.out.println("Amount to be withdraw : ");
		double amt = sc.nextDouble();
		
		if(sa.withdraw(amt)==true)
			System.out.println("Success");
		else
			System.out.println("Fail");
	}

}
