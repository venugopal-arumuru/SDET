package com.java.oops1;

public class StdMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		System.out.println("First Student Details");
		std1.getStudentInfo();
		std1.printStdDetails();
		
		Student std2 = new Student();
		System.out.println("Second Student Details");
		std2.getStudentInfo();
		std2.printStdDetails();
		

	}

}
