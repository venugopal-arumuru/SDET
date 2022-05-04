package com.java.jdbcpack;
import java.sql.*;
import java.util.*;
public class DeleteRows {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee Number : ");
			int eno = sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdetdb","root","root");
			
			PreparedStatement stmt = conObj.prepareStatement("Select * from emp where empno=?");
			stmt.setInt(1, eno);
			ResultSet  rs = stmt.executeQuery();
			if(rs.next())
			{
				PreparedStatement ps = conObj.prepareStatement("Delete from emp where empno=?");
				ps.setInt(1, eno);
				ps.executeUpdate();
				System.out.println("Employee Deleted....");
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
