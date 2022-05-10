package com.java.hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stdinfo")
public class Student {

	@Id  // primary key
	@Column(name="rollnumber")
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement by 1
	private int rollno;
	
	@Column(name="stdname", length=30, nullable=false)
	private String sname;
	
	@Column(length=30, nullable=false)
	private String course;
		
	private float fees;
	
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
}