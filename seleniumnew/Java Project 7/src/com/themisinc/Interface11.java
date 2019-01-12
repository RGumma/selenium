package com.themisinc;

public class Interface11 implements Interface{

	
  @Override
	public void m1() {
	
	  System.out.println("Overriding method of m1");
		
	}

	@Override
	public void m2() {
		
		System.out.println("Overriding method of m2");
	}
	
	
	public void m3(){
		
		System.out.println("Method overloading of m3");
	}

	
	public static void main(String[] args) {
	
	   Interface11 i = new Interface11();
	   
	   Interface i = new Interface();
	   
	   i.m1();
	   
	   i.m2();
	   
	   i.m3();
	
	}
	
	
}
