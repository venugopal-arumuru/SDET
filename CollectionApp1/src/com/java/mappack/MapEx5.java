package com.java.mappack;
import java.util.*;
public class MapEx5 {
//search
	public static void main(String[] args) {
		Map<String,String>  mapPhoneBook = new HashMap<String, String>();
	
		mapPhoneBook.put("Venugopal", "9988123456");
		mapPhoneBook.put("Bhavani", "9988123457");
		mapPhoneBook.put("Krishna", "9988123458");
		mapPhoneBook.put("Laxmi", "9988123459");
		
		System.out.println(mapPhoneBook);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		String s = sc.next();
		
		if(mapPhoneBook.containsKey(s))
		{
			System.out.println("Phone Number is : " +  mapPhoneBook.get(s));
		}
		else
		{
			System.out.println("Customer Not Found");
		}
	}

}
