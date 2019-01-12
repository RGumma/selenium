package com.themisinc;

public class Person1Test {

	public static void main(String[] args) {
		
		Person1 p1= new Person1();
		Address a1 = new Address();
		
		
		a1.setAddr1("1805");
		a1.setAddr2("Macurthur");
		a1.setCity("Mckinney");
		a1.setState("TX");
		a1.setStreet("houghton drive");
		a1.setZipCode("75070");
		

		String firstName = "Rajani";
		String lastName ="gummadidala";
		int age=30;
		char sex='F';
		
		p1.setAge(age);
		p1.setFirstName(firstName);
		p1.setLastName(lastName);
		p1.setSex(sex);
		p1.setAddress(a1);
		
		System.out.println("value of a person p1 is" + p1);
		//System.out.println(p1.getAddress());
		
		Person1 p2 = new Person1();
		p2.setAge(age);
		p2.setFirstName(firstName);
		p2.setLastName(lastName);
		p2.setSex(sex);
		p2.setAddress(a1);
		
		Address a2 = new Address();
		a2.setAddr1("1805");
		a2.setAddr2("Macurthur");
		a2.setCity("Mckinney");
		a2.setState("TX");
		a2.setStreet("houghton drive");
		a2.setZipCode("75070");
		
		
		System.out.println("value of a person p2 is" + p2);
		System.out.println(p1.equals(p2));
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		
				
		
}

}