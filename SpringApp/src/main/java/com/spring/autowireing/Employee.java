package com.spring.autowireing;

public class Employee {

	private int eno;
	private String ename;
	private Address adrs;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	public void PrintDetails()
	{
		System.out.println("Employee Number : " + this.getEno());
		System.out.println("Employee Name : " + this.getEname());
		System.out.println("Address Info : ");
		System.out.println(this.adrs.getHouseno() + "\t" + this.adrs.getLocation() + "\t" + this.adrs.getState());
	}
}
