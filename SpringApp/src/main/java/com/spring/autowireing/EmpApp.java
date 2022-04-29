package com.spring.autowireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("configautowire.xml");
		
		Employee emp = (Employee)ac.getBean("empObj");
		emp.PrintDetails();
	
	}

}
