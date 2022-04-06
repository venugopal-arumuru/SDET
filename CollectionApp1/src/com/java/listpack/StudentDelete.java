package com.java.listpack;
import java.util.*;
public class StudentDelete {

	public static void main(String[] args) {
		
		List<Student>  lstStd = new ArrayList<Student>();
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rno = sc.nextInt();
		boolean chk = false;
		for(Student s : lstStd)
		{
			if(s.getRollno()==rno)
			{				
				lstStd.remove(s);
				System.out.println(lstStd);
				chk=true;
				break;
			}
		}
		
		if(chk==false)
		{
			System.out.println("Student Not Found....");
		}
	}

}
