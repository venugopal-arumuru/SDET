package com.java.jdbcpack1;
import java.sql.*;
import java.io.*;
public class ShowAllRows {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			Connection conObj = MyDbConn.DbConnection();
			
			PreparedStatement stmt = conObj.prepareStatement("Select * from emp");
			ResultSet  rs = stmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Employee Number : " + rs.getInt("empno"));
				System.out.println("Employee Name : " + rs.getString("empname"));
				System.out.println("Employee Job : " + rs.getString("job"));
				System.out.println("Employee Salary : " + rs.getInt("sal"));
				System.out.println("----------------------");
			}			
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
