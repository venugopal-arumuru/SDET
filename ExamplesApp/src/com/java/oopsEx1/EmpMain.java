package com.java.oopsEx1;
import java.util.*;
public class EmpMain {

	public static Employee getEmployeeDetails()
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Employee ID : ");
		emp.setEmployeeId(sc.nextInt());
		System.out.println("Employee Name : ");
		emp.setEmployeeName(sc.next());
		System.out.println("Employee Salary : ");
		emp.setSalary(sc.nextDouble());		
		return emp;
	}
	
	public static int getPFPercentage()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PF Percentage Value : ");
		int pfpercent = sc.nextInt();
		return pfpercent;
	}
	
	public static void main(String[] args) {
		Employee  einfo = EmpMain.getEmployeeDetails();
		int pf =  EmpMain.getPFPercentage();
		einfo.calculateNetSalary(pf);
		
		System.out.println("ID : " + einfo.getEmployeeId());
		System.out.println("Name : " + einfo.getEmployeeName());
		System.out.println("Salary : " + einfo.getSalary());
		System.out.println("Net Salary : " + einfo.getNetSalary());
	}

}
