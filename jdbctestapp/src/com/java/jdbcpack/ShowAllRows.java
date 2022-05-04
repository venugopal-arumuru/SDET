package com.java.jdbcpack;
import java.sql.*;
import java.io.*;
public class ShowAllRows {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");
			
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
