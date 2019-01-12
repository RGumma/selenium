package com.themisinc;

public class Student {
	
	String name;
	
	int id;
	
	
	public Student(int i, String n){
		
	this.name=n;
	this.id=i;
	
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}


public static void main(String[] args) {
		
		Student s = new Student(12, "Rajani");
		
		System.out.println(s);
		
	}

}
