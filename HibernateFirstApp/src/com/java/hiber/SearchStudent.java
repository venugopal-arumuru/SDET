package com.java.hiber;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class SearchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll Number : ");
		int rno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Query qr = s.createQuery("from Student where rollno=:v1");
		qr.setParameter("v1", rno);
		List<Student> lst = qr.list();
		
		if(!lst.isEmpty())
		{
			for(Student s1 : lst)
			{
				System.out.println( s1.getSname());
			}
		}
		else
			System.out.println("Student Not Found....");
		s.close();
		sf.close();
	}
}
