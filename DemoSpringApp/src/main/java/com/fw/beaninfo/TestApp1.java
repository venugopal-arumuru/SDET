package com.fw.beaninfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp1 {

	public static void main(String[] args) {
		ApplicationContext fact = new ClassPathXmlApplicationContext("config1.xml");
		
		Employee emp = (Employee)fact.getBean("empObj");
		System.out.println("Employee Details:");
		System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob() + "\t" + emp.getSal());
		System.out.println("Account Details:\n" + emp.getAcinfo());
	}
}
