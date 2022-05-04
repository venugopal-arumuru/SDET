package com.java.jdbcpack1;
import java.sql.*;
import java.util.*;
public class SearchingRows {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee Number : ");
			int eno = sc.nextInt();
			
			Connection conObj = MyDbConn.DbConnection();
			
			
			PreparedStatement stmt = conObj.prepareStatement("Select * from emp where empno=?");
			stmt.setInt(1, eno);
			ResultSet  rs = stmt.executeQuery();
			if(rs.next())
			{
				System.out.println("Employee Number : " + rs.getInt("empno"));
				System.out.println("Employee Name : " + rs.getString("empname"));
				System.out.println("Employee Job : " + rs.getString("job"));
				System.out.println("Employee Salary : " + rs.getInt("sal"));				
			}			
			else
				System.out.println("Employee Not Found....");
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
