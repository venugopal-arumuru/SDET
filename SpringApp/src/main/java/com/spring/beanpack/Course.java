package com.spring.beanpack;

public class Course {

	private String cname;
	private float fees;
	private String duration;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "\t\t\tCourse Information\nCourse Name=" + cname + "\nFees=" + fees + "\nDuration=" + duration;
	}
}
