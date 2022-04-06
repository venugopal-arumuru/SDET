package com.java.mappack;
import java.util.*;
public class MapEx1 {

	public static void main(String[] args) {
		Map<String,String>  mapPhoneBook = new HashMap<String, String>();
	
		mapPhoneBook.put("Venugopal", "9988123456");
		mapPhoneBook.put("Bhavani", "9988123457");
		mapPhoneBook.put("Krishna", "9988123458");
		mapPhoneBook.put("Laxmi", "9988123459");
		
		System.out.println(mapPhoneBook);
		
		for(Map.Entry m:mapPhoneBook.entrySet())
		{  
		   System.out.println(m.getKey() + "\t" + m.getValue());  
		}  
	}

}
