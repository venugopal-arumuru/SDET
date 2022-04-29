package com.spring.beanpack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("configstd.xml");
		Student std =  (Student)ac.getBean("stdObj");
		
		System.out.println(std);
	}
}
