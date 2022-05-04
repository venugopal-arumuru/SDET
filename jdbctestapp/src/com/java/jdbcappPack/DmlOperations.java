package com.java.jdbcappPack;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DmlOperations {

	private Connection conObj = null;
	public DmlOperations() throws Exception
	{
		conObj = MyDbConn.DbConnection();
	}
	
	public String AddNewEmployee(Employee emp)
	{
		String result = "";
		try
		{
			PreparedStatement ps = conObj.prepareStatement("Insert into emp values(?,?,?,?)");
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEmpname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getSal());
			
			int r = ps.executeUpdate();
			if(r>=1)
				result = "Employee Added...";				
		}
		catch(Exception ex)
		{
			result = ex.getMessage();
		}
		
		return result;
	}
	
	public String UpdateEmpName(Employee emp)
	{
		String result = "";
		try
		{
			PreparedStatement ps = conObj.prepareStatement("Update emp set empname=? where empno=?");
			ps.setString(1, emp.getEmpname());
			ps.setInt(2, emp.getEmpno());
			
			
			int r = ps.executeUpdate();
			if(r>=1)
				result = "Employee Name Modified...";				
		}
		catch(Exception ex)
		{
			result = ex.getMessage();
		}
		
		return result;
	}
	
	
	public List<Employee>  ShowAll()
	{
		List<Employee>  lsEmp = new ArrayList<Employee>();
		Employee emp = null;
		try
		{
			PreparedStatement ps = conObj.prepareStatement("Select * from emp");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setJob(rs.getString("job"));
				emp.setSal(rs.getInt("sal"));
				lsEmp.add(emp);
			}				
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return lsEmp;
	}
	
	public Employee SearchEmp(int eno)
	{
		Employee emp = null;
		try
		{
			PreparedStatement ps = conObj.prepareStatement("Select * from emp where empno=?");
			ps.setInt(1, eno);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setJob(rs.getString("job"));
				emp.setSal(rs.getInt("sal"));				
			}				
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return emp;
	}
	
	
	public String DeleteEmployee(int eno)
	{
		String result = "";
		try
		{
			PreparedStatement ps = conObj.prepareStatement("delete from emp where empno=?");		
			ps.setInt(1, eno);
			int r = ps.executeUpdate();
			if(r>=1)
				result = "Employee Deleted....";				
		}
		catch(Exception ex)
		{
			result = ex.getMessage();
		}
		
		return result;
	}
}
