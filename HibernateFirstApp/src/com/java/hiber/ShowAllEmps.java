package com.java.hiber;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowAllEmps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Query qr = s.createQuery("from Employee");
		
		List<Employee> lst = qr.list();
		
		for(Employee e : lst)
		{
			System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getSal()  + "\t" + e.getJob());
		}
		s.close();
		sf.close();
	}

}
