package com.themisinc;

public class PersonTest {

	public static void main(String[] args) {
		
	 Person p1 = new Person();
	 p1.setAge(30);
	 p1.setName("Rajani");
	 p1.setSex('F');
	 System.out.println("Value of person p1 ="+p1);// Fail
	 
	 //Person
	 
	 Person p2 = new Person();
	 p2.setAge(30);
	 p2.setName("Rajani");
	 p2.setSex('F');
	 
	 System.out.println(p1.equals(p2)); //Fail
	 
	 
	}

}
