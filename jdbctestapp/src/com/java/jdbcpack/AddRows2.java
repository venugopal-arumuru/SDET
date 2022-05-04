package com.java.jdbcpack;
import java.sql.*;
import java.io.*;
public class AddRows2 {

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
			
			
			String inscmd = "Insert into emp values(";
			inscmd = inscmd + eno + ",'" + ename + "','" + job + "'," + sal + ")";
			System.out.println(inscmd);
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");
			
			Statement stmt = conObj.createStatement();
			
			stmt.executeUpdate(inscmd);
			
			System.out.println("Row is Inserted....");	
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
