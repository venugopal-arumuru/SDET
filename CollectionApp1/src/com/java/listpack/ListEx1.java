package com.java.listpack;
import java.util.*;
public class ListEx1 {

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
		for(String str : lstStr)
		{
			System.out.println(str);
		}
		System.out.println("---------------------");
		Iterator itr = lstStr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
