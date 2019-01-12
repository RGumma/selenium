package com.themisinc;

public class Student {
	
	
	int rollno;
	 String name;
	 static String college= "JNTU";
	 
	 Student( int rollno, String name){
		this.rollno=rollno; 
		 this.name=name;
		 
		 
	 }
	 
	 
	 public void display(){
		 
		 System.out.println(rollno + " "+ name+" "+ college);
	 }
	 
	 
	 public static void main(String[] args) {
	 Student s1 = new Student(55, "Rajani");
	 Student s2 = new Student(60,"Rajitha");
	 
	 
	 
	 s1.display();
	 s2.display();
	 
	 
	 
	 
	 

	

	}

}
