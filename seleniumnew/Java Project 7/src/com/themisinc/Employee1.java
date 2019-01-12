package com.themisinc;

public class Employee1 {

	int eid;

	String ename;

	float esal;

	Employee1(int eid1, String ename1, float esal1) {

		this.eid = eid1;
		this.ename = ename1;

		this.esal = esal1;
		
	}

	void display() {

		System.out.println("emp id" + eid);

		System.out.println("emp name = +ename");

		System.out.println("emp sal " + esal);

	}

	public static void main(String[] args) {

		Employee1 e1 = new Employee1(111, "ratan", 10000);

		e1.display();

		Employee1 e2 = new Employee1(222, "anu", 20000);

		e2.display();

	}

}
