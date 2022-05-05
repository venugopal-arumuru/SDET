package com.jdbc.service;

import java.util.*;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.jdbc.beans.Employee;

public class EmpServiceImpl implements EmpService {

	private DataSource  dbConn;
	private JdbcTemplate  jt;
			
	public DataSource getDbConn() {
		return dbConn;
	}

	public void setDbConn(DataSource dbConn) {
		this.dbConn = dbConn;
		jt = new JdbcTemplate(dbConn);
	}

	public String AddEmployee(Employee emp) {
		String inscmd = "Insert into emp values(?,?,?,?)";
		String output = "Error";
		int res =  jt.update(inscmd, new Object[] {emp.getEmpno(), emp.getEmpname(), emp.getJob(), emp.getSal()});

		if(res>=1)
			output = "Emp Addedd....";
		return output;
	}

	public List<Employee> ShowAll() {
		List<Employee>  emplist = new ArrayList<Employee>();
		String sql = "Select * from emp";
		emplist = jt.query(sql, new BeanPropertyRowMapper(Employee.class));
		return emplist;
	}

	public Employee SearchEmp(int eno) {	
		Employee emp = null;
		try
		{
		String sql = "Select * from emp where empno=?";		
		emp = (Employee)jt.queryForObject(sql,new Object[] {eno}, new BeanPropertyRowMapper(Employee.class));
		}
		catch(Exception ex)
		{
			emp = null;
		}
		return emp;
	}

	public String UpdateEmpName(Employee emp) {
		String sql = "Update emp set empname=? where empno=?";
		String output = "Error";
		int res =  jt.update(sql, new Object[] {emp.getEmpname(), emp.getEmpno()});

		if(res>=1)
			output = "Emp Modified....";
		return output;
	}

	public String DeleteEmp(int eno) {
		String sql = "Delete from emp where empno=?";
		String output = "Error";
		int res = jt.update(sql, new Object[] {eno});
		if(res>=1)
			output = "Emp Deleted....";
		return output;
	}
}
