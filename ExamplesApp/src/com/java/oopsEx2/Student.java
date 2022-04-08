package com.java.oopsEx2;

public class Student {
	private int id;
	private String name;
	private float average;
	private char grade;
	private int marks[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public  void calculateAvg()
	{
		int total = 0;
		for(int i=0;i<marks.length;i++)
		{
			total = total + marks[i];
		}
		average = total/marks.length;
	}
	
	public void findGrade()
	{
		boolean res = false;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<50)
			{
				grade='F';
				res = true;
			}
		}
		if(res==false)
		{
			if(average>=80 && average<=100)
				grade='O';
			else
				grade='A';
		}
	}
	
}
