package com.fw.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdMain2 {

	public static void main(String[] args) {
	
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		
		Student std = (Student)fact.getBean("stdObj");
		
		System.out.println("Roll Number : " + std.getRollno());
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Course : " + std.getCourse());
		System.out.println("Fees : " + std.getFees());
	}
}
