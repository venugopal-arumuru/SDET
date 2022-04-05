package com.java.wrapper;

public class Student {
	private int rno;
	private String sname;
	private String course;
	private float fees;
	
	public Student(int rno, String sname, String course, float fees) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}

	@Override
	public String toString() {
		String output = "";
		output = output + "Roll Number : "  + rno;
		output = output + "\nStudent name : "  + sname;
		output = output + "\nStudent Course : "  + course;
		output = output + "\nFees : "  + fees;
		return output;
		//return "rno=" + rno + ", sname=" + sname + ", course=" + course + ", fees=" + fees;
	}
}
