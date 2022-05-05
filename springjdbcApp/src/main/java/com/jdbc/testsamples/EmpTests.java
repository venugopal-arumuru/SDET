package com.jdbc.testsamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.beans.Employee;
import com.jdbc.service.EmpService;
import java.io.*;
import java.util.List;
public class EmpTests {

	public static void main(String[] args) {

		try
		{
			int eno=0;
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		EmpService es = (EmpService)fact.getBean("EmpObj");
		Employee  emp = new Employee();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		while(true)
		{
		System.out.println("1. Add Emp\n2. Show All\n3. Search Emp\n4. Update Emp Name\n5. Delete Emp\n6. Exit");
		System.out.println("Pick Option : ");
		int ch =Integer.parseInt(br.readLine());
		
		switch(ch)
		{
		case 1:
			System.out.println("Employee Number : ");
			emp.setEmpno(Integer.parseInt(br.readLine()));
			
			System.out.println("Employee Name : ");
			emp.setEmpname(br.readLine());
			
			System.out.println("Employee Job : ");
			emp.setJob(br.readLine());

			System.out.println("Employee Salary : ");
			emp.setSal(Integer.parseInt(br.readLine()));
			
			System.out.println(es.AddEmployee(emp));
			break;
		case 2:
			List<Employee>  empall = es.ShowAll();
			for(Employee em : empall)
			{
				System.out.println(em.getEmpno() + "\t" + em.getEmpname() + "\t" + em.getJob() + "\t" + em.getSal());
			}
			break;
		case 3:
			System.out.println("Employee Number : ");
			eno = Integer.parseInt(br.readLine());
			Employee em = es.SearchEmp(eno);
			if(em!=null)
				System.out.println(em.getEmpno() + "\t" + em.getEmpname() + "\t" + em.getJob() + "\t" + em.getSal());
			else
				System.out.println("Employee Not Found");
			break;
		case 4:
			System.out.println("Employee Number : ");
			eno = Integer.parseInt(br.readLine());
			em = es.SearchEmp(eno);
			if(em!=null)
			{
				System.out.println("Present Name of Employee : " + em.getEmpname());
				System.out.println("New Name of Employee : ");
				em.setEmpname(br.readLine());
				System.out.println(es.UpdateEmpName(em));
			}
				else
				System.out.println("Employee Not Found");
			break;
		case 5:
			System.out.println("Employee Number : ");
			eno = Integer.parseInt(br.readLine());
			em = es.SearchEmp(eno);
			if(em!=null)
			{
				System.out.println(em.getEmpno() + "\t" + em.getEmpname() + "\t" + em.getJob() + "\t" + em.getSal());
				System.out.println(es.DeleteEmp(eno));
			}
				else
				System.out.println("Employee Not Found");
			break;
		case 6:
			System.out.println("Thanks for Using App");
			System.exit(0);
		}
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
