package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("configperson.xml");

		Person person = (Person)ac.getBean("perObj1");
		System.out.println(person);
		
	}

}
