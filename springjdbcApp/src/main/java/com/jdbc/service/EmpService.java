package com.jdbc.service;

import java.util.List;

import com.jdbc.beans.Employee;

public interface EmpService {

	public String AddEmployee(Employee emp);
	public List<Employee>  ShowAll();
	public Employee SearchEmp(int eno);
	public String UpdateEmpName(Employee emp);
	public String DeleteEmp(int eno);	
}
