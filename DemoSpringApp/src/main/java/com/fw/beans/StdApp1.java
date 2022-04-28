package com.fw.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdApp1 {

	public static void main(String[] args) {
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) fact.getBean("empObj");
		System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob() + "\t" + emp.getSal());
	}

}
