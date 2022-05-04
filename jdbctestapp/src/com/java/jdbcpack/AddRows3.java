package com.java.jdbcpack;
import java.sql.*;
import java.io.*;
public class AddRows3 {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Employee Number : ");
			int eno = Integer.parseInt(br.readLine());
			
			System.out.println("Employee Name : ");
			String ename = br.readLine();
			
			System.out.println("Employee Job : ");
			String job = br.readLine();
			
			System.out.println("Employee Salary : ");
			int sal = Integer.parseInt(br.readLine());
							
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");
			
			PreparedStatement stmt = conObj.prepareStatement("Insert into emp values(?,?,?,?)");
			stmt.setInt(1, eno);
			stmt.setString(2, ename);
			stmt.setString(3, job);
			stmt.setInt(4, sal);			
			stmt.executeUpdate();
			
			System.out.println("Row is Inserted....");
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
