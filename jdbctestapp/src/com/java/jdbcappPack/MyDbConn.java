package com.java.jdbcappPack;
import java.sql.*;
public class MyDbConn {

	private static Connection conObj=null;
	public static Connection DbConnection() throws SQLException 
	{		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}		
		return conObj;
	}
}
