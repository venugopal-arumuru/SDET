package com.java.listpack;
import java.util.*;
public class ListEx4 {

	public static void main(String[] args) {
		List<Integer>  lstInt = new ArrayList<Integer>();
		lstInt.add(101);
		lstInt.add(102);
		lstInt.add(103);
		lstInt.add(104);
		lstInt.add(105);
		
		System.out.println(lstInt);
		System.out.println("---------------------");
		for(Integer i : lstInt)
		{
			System.out.println(i);
		}
		System.out.println("---------------------");
		Iterator itr = lstInt.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
