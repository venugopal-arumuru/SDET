package com.java.hiber;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.io.*;
public class UpdateStdName {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("Student Roll Number : ");
		int rno = Integer.parseInt(br.readLine()); 
		
		System.out.println("New name of Student : ");
		String sname = br.readLine();
				
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query qr = s.createQuery("Update Student set sname=:v1 where rollno=:v2");
		qr.setParameter("v1",sname);
		qr.setParameter("v2", rno);
		int res = qr.executeUpdate();
		if(res>=1)
		{
			t.commit();
			System.out.println("Name modified");
		}
		else
			System.out.println("Student Not Found....");
				
		s.close();
		sf.close();
	}

}
