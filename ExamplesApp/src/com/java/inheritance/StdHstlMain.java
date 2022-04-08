package com.java.inheritance;
import java.util.*;
public class StdHstlMain {

	public static Hosteller getHostellerDetails()
	{
		Scanner sc = new Scanner(System.in);
		Hosteller hst = new Hosteller();
		System.out.println("Student ID : ");
		hst.setStudentId(sc.nextInt());
		System.out.println("Student Name : ");
		hst.setName(sc.next());
		System.out.println("Department ID : ");
		hst.setDepartmentId(sc.nextInt());
		System.out.println("Gender ");
		hst.setGender(sc.next());
		System.out.println("Phone Number ");
		hst.setPhone(sc.next());
		System.out.println("Hostel Name : ");
		hst.setHostelName(sc.next());
		System.out.println("Room Number : ");
		hst.setRoomNumber(sc.nextInt());
		
		return hst;
	}
	
	
	public static void main(String[] args) {
		Hosteller stdinfo = StdHstlMain.getHostellerDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Modify Room Number(y/n) : ");
		String rm = sc.next();
		if(rm.equalsIgnoreCase("Y"))
		{
			System.out.println("New Room Number : ");
			stdinfo.setRoomNumber(sc.nextInt());
		}
		System.out.println("Modify Phone Number(y/n) : ");
		String ph = sc.next();
		if(ph.equalsIgnoreCase("Y"))
		{
			System.out.println("New Phone Number : ");
			stdinfo.setPhone(sc.next());
		}
		String output = stdinfo.getStudentId() + "\t" + stdinfo.getName();
		output += "\t" + stdinfo.getGender() + "\t" + stdinfo.getDepartmentId();
		output += "\t" + stdinfo.getPhone() + "\t" + stdinfo.getHostelName();
		output += "\t" + stdinfo.getRoomNumber();
		System.out.println("Student Details ");
		System.out.println(output);
	}

}
