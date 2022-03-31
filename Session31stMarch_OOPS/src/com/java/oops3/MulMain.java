package com.java.oops3;

abstract class Biodata
{
	protected String sname, course;
	
	void getStdinfo(String sn, String cur)
	{
		sname = sn;
		course = cur;
	}
}

class marks extends Biodata
{
	protected int sub1,sub2;
	
	void getMarks(int s1, int s2)
	{
		sub1 = s1;
		sub2 = s2;
	}
}

final class Results extends marks
{
	
	void printresults()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Course : " + course);
		System.out.println("Sub1 : " + sub1 + "\tSub2 : " + sub2);
		System.out.println("Total Marks : " + (sub1+sub2));
	}
}

public class MulMain {

	public static void main(String[] args) {

		Results r1 = new Results();
		r1.getStdinfo("Pavan", "Java");
		r1.getMarks(56, 70);
		r1.printresults();
	}

}
