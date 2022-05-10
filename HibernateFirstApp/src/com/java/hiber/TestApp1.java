package com.java.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpno(1002);
		emp.setEname("Pavan");
		emp.setJob("Manager");
		emp.setSal(12000.00f);
		
		s.save(emp); // row will be inserted...
		
		t.commit();
		
		s.close();
		sf.close();
		System.out.println("Row Inserted....");
	}

}
