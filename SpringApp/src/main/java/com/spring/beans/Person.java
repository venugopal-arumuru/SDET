package com.spring.beans;

public class Person {

	private int pno;
	private String pname;
	private String phone;
	private String email;
	
	public Person(int pno, String pname, String phone, String email) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.phone = phone;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Person [pno=" + pno + ", pname=" + pname + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
