package com.java.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.io.*;
public class AddStdDynamically {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Student std = new Student();
		
		System.out.println("Student Name : ");
		std.setSname(br.readLine());
		
		System.out.println("Student Course : ");
		std.setCourse(br.readLine());
		
		System.out.println("Course Fees : ");
		std.setFees(Float.parseFloat(br.readLine()));
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Serializable sz = s.save(std);
		System.out.println("With Roll Number : " + (Integer)sz + " Assigned for student");
		t.commit();
		s.close();
		sf.close();
	}

}
