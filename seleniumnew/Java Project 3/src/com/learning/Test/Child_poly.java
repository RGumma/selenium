package com.learning.Test;

public class Child_poly extends Parent_poly{
	
	
	public void m1(){
		
		System.out.println("child m1");
	}
	
	public void m2(){
		
		System.out.println("direct m1");
	}
	
	public static void main(String[] args) {
		
	 	Parent_poly	p = new Child_poly();
	 	
	 	p.m1();// compiler: parent    runtime : child object 
	 	
	 	
		p.m2(); //error message 
		
		

	}

}
