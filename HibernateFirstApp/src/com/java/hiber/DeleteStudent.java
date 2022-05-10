package com.java.hiber;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.io.*;
public class DeleteStudent {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("Student Roll Number : ");
		int rno = Integer.parseInt(br.readLine()); 
			
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query qr = s.createQuery("Delete from Student where rollno=:v1");		
		qr.setParameter("v1", rno);
		int res = qr.executeUpdate();
		if(res>=1)
		{
			t.commit();
			System.out.println("Student Deleted.....");
		}
		else
			System.out.println("Student Not Found....");
				
		s.close();
		sf.close();
	}

}
