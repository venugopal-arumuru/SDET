package com.java.jdbcpack1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;
public class ModifyEmpName {

	public static void main(String[] args) throws SQLException 
	{		
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Employee Number : ");
			int eno = Integer.parseInt(br.readLine());
			
			Connection conObj = MyDbConn.DbConnection();
			
			PreparedStatement stmt = conObj.prepareStatement("Select * from emp where empno=?");
			stmt.setInt(1, eno);
			ResultSet  rs = stmt.executeQuery();
			if(rs.next())
			{
				System.out.println("Current Name of Employee : " + rs.getString("empname"));
				
				System.out.println("New name for Employee : ");
				String ename = br.readLine();
								
				PreparedStatement ps = conObj.prepareStatement("Update emp set empname=? where empno=?");
				ps.setString(1, ename);
				ps.setInt(2, eno);
				ps.executeUpdate();
				System.out.println("Employee Modified....");
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
