package com.java.wrapper;

public class StdMain {

	public static void main(String[] args) {
		Student std1 = new Student(101, "Naresh", "Java", 15000.00f);
		System.out.println(std1);
		System.out.println("--------------");
		Student std2 = new Student(102, "Sathish", "Java", 15000.00f);	
		System.out.println(std2);
	}

}
