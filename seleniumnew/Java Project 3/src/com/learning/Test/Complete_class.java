package com.learning.Test;

public class Complete_class {
	
	static int eid;
	
	int ename;
	
	static{
		
		eid = 111;
	}
	
	
	{
		
		ename=222;
	}
	
	public void m1(){
		
		
		System.out.println("Instance- method");
	}
	
	
	public static void m2(){
		
		
		System.out.println("Static_method");
	}
	
	static{
		
	System.out.println("I am in static-block");	
		
	}
	
	{
		
		System.out.println("I am in instance - block");
	}
	
	Complete_class(){
		
		System.out.println("I am in constructor");
	}
	
	Complete_class(int a){
		
	System.out.println("I am in 1 arg constructor");	
		
	}
	
	
public static void main(String[] args) {
	
System.out.println(Complete_class.eid);
	
	Complete_class.m2();
	
	Complete_class c = new Complete_class();
	
	c.m1();
	
	Complete_class c1 = new Complete_class(10);
	
	
	
	System.out.println(c.ename);
	


		

	}

}
