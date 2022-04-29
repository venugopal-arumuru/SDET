package com.spring.autowireing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int rollno;
	private String sname;
	private Course course;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCourse() {
		return course;
	}
	
	@Autowired(required=true)
	@Qualifier("course2")
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Students Info\nRoll Number=" + rollno + "\nStudent Name=" + sname + "\n" + course;
	}
}
