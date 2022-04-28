package com.fw.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StdMain {

	public static void main(String[] args) {
	
		Resource rs = new ClassPathResource("config.xml");
		BeanFactory  fact = new XmlBeanFactory(rs);
		
		Student std = (Student)fact.getBean("stdObj");
		
		System.out.println("Roll Number : " + std.getRollno());
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Course : " + std.getCourse());
		System.out.println("Fees : " + std.getFees());
	}

}
