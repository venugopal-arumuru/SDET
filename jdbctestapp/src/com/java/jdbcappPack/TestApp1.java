package com.java.jdbcappPack;
import java.sql.SQLException;
import java.util.*;
public class TestApp1 {
// my sql working
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		DmlOperations dml = new DmlOperations();
		
		while(true)
		{
			System.out.println("--------------------------------");
			System.out.println("1. Add New Employee\n2. Show All Employees\n3. Search Emp\n4. Update Employee Name\n5. Delete Employee\n6. Exit");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				Employee emp = new Employee();
				System.out.println("Employee Number : ");
				emp.setEmpno(sc.nextInt());
				
				System.out.println("Employee Name : ");
				emp.setEmpname(sc.next());
				
				System.out.println("Employee Job : ");
				emp.setJob(sc.next());
				
				System.out.println("Employee Salary : ");
				emp.setSal(sc.nextInt());
				
				System.out.println(dml.AddNewEmployee(emp));
				break;
			case 2:
				List<Employee>  allemp = dml.ShowAll();
				for(Employee em : allemp)
				{
					System.out.println(em.getEmpno() + "\t" + em.getEmpname() + "\t" + em.getJob() + "\t" + em.getSal());
				}
				break;
			case 3:
				System.out.println("Employee Number ");
				int en = sc.nextInt();
				Employee em = dml.SearchEmp(en);
				if(em!=null)
				{
					System.out.println(em.getEmpno() + "\t" + em.getEmpname() + "\t" + em.getJob() + "\t" + em.getSal());
				}
				else
					System.out.println("Employee Not Found");
				break;
			case 4:
				System.out.println("Employee Number ");
				en = sc.nextInt();
				Employee uem = dml.SearchEmp(en);
				if(uem!=null)
				{
					System.out.println("Present Name : " + uem.getEmpname());
					System.out.println("New Name for Employee to modify : ");
					uem.setEmpname(sc.next());
					System.out.println(dml.UpdateEmpName(uem));
				}
				else
					System.out.println("Employee Not Found");
				break;
			case 5:
				System.out.println("Employee Number ");
				en = sc.nextInt();
				Employee dem = dml.SearchEmp(en);
				if(dem!=null)
				{
					System.out.println("Emp Details: ");
					System.out.println(dem.getEmpno() + "\t" + dem.getEmpname() + "\t" + dem.getJob() + "\t" + dem.getSal());
					System.out.println("Are u sure to delete(y/n) : ");
					char chs =  sc.next().charAt(0);
					if(chs=='Y' || chs=='y')
					{
						System.out.println(dml.DeleteEmployee(en));
					}
				}
				else
					System.out.println("Employee Not Found");
				break;
			case 6:
				System.out.println("Thanks for using this App");
				System.exit(0);				
			}
		}
	}
}
