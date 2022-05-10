package com.java.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Student std = new Student();
		std.setSname("Praveen");
		std.setCourse("Java");
		std.setFees(20000.00f);
		
		s.save(std); // row will be inserted...
		
		t.commit();
		
		s.close();
		sf.close();
		System.out.println("Row Inserted....");
	}

}
