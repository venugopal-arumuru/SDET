package com.java.jdbcpack;
import java.sql.*;
public class MyDbConn {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");
			
			if(conObj!=null)
				System.out.println("Connected");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
