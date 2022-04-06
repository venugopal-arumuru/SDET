package com.java.listpack;
import java.util.*;
public class StudentsAdd {

	public static void main(String[] args) {
		
		List<Student>  lstStd = new LinkedList<Student>();
		Student std = new Student(1001, "Santhoshi", "Java", 15000.00f);
		lstStd.add(std);
		std = new Student(1002, "Abhipreet", "Java", 15000.00f);
		lstStd.add(std);
		std = new Student(1003, "Suneel", "Java", 15000.00f);
		lstStd.add(std);
		std = new Student(1004, "Yamuna", "Java", 15000.00f);
		lstStd.add(std);
		std = new Student(1005, "Chandana", "Java", 15000.00f);
		lstStd.add(std);

		System.out.println(lstStd);
		System.out.println("-----------------------");
		for(Student s : lstStd)
		{
			System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
		}
	}

}
