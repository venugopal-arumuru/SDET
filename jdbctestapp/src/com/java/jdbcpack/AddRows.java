package com.java.jdbcpack;
import java.sql.*;
public class AddRows {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");
			
			Statement stmt = conObj.createStatement();
			
			stmt.executeUpdate("Insert into emp values(101, 'Satyam', 'Trainer', 15000)");
			
			System.out.println("Row is Inserted....");	
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
