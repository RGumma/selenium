package com.learning.Test;

public class ChildInterface1 extends ChildInterface{
	
	
	
public void m2() {
		
	System.out.println("m2 method");
		
	}

	
	public static void main(String[] args) {
		
		//ChildInterface1 c = new ChildInterface1();
		
		//c.m1();
		
		ChildInterface c = new ChildInterface1();
		
		c.m1();
		c.m2();
		
		c.m3();
		
		
		
		
		

	}

	
	
}
