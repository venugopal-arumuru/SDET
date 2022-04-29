package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("configemp.xml");
		Employee emp1 = (Employee) ac.getBean("empObj1");
		System.out.println(emp1.getEmpno() + "\t" + emp1.getEname() + "\t" + emp1.getJob() + "\t" + emp1.getSal());
		
		Employee emp2 = (Employee) ac.getBean("empObj2");
		System.out.println(emp2.getEmpno() + "\t" + emp2.getEname() + "\t" + emp2.getJob() + "\t" + emp2.getSal());
		
	}

}
