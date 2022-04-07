package com.java.listpack;
import java.math.BigInteger;
import java.util.*;
public class ListEx4 {

	public static void main(String[] args) {
		List<Integer>  lstInt = new ArrayList<Integer>();
		lstInt.add(101);
		lstInt.add(102);
		lstInt.add(105);
		lstInt.add(103);
		lstInt.add(104);
		System.out.println("Actual Order ");
		System.out.println(lstInt);
		System.out.println("Asending Order");
		Collections.sort(lstInt);
		System.out.println(lstInt);
		System.out.println("Desending Order");
		Collections.sort(lstInt, Collections.reverseOrder());
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
		
		List<BigInteger>  lst1 = new ArrayList<BigInteger>();
		BigInteger b = new BigInteger("100");
		lst1.add(b);
		b = new BigInteger("101");
		lst1.add(b);
		b = new BigInteger("11");
		lst1.add(b);
		
		System.out.println(lst1);
		Collections.sort(lst1);
		System.out.println(lst1);
	}

}
