package com.themisinc;

public class Childclass extends  Parentmethods {
	
	
	public void m1(){
		
		
		System.out.println("I am in method m1");
		
	}
	
	
	public void m3(){
	
		this.m1();
		super.m1();
		
	}

	public static void main(String[] args) {
		
		Childclass c = new Childclass();
				c.m3();

	}

}
