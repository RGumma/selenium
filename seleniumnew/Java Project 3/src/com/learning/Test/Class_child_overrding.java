package com.learning.Test;

public class Class_child_overrding  extends Class_Static_overriding{
	
	
	static void m1(){
		
		
		System.out.println("child class m1");
	}

	public static void main(String[] args) {
		
		//Class_Static_overriding cv = new Class_Static_overriding();
		
		//cv.m1();
		
		Class_child_overrding q = new Class_child_overrding();
		
		q.m1();
		
	}

}
