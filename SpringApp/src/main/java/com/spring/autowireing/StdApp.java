package com.spring.autowireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("configautowire2.xml");
		Student std =  (Student)ac.getBean("stdObj");
		
		System.out.println(std);
	}
}
