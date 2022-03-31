package com.java.oops2;

public class ConsMain {
	public static void main(String[] args) {
		DemoCons dc1 = new DemoCons();
		dc1.printval();
		System.out.println("----------------");
		ConsParam  cp1 = new ConsParam(11,22);
		cp1.printval();

		ConsParam  cp2 = new ConsParam(100,200);
		cp2.printval();
		System.out.println("----------------");
		MulCons mc1 = new MulCons(); //it will call constrctor wihtout arg
		mc1.printval();
		MulCons mc2 = new MulCons(134,456); // it will call constructor with arg
		mc2.printval();
	}
}
