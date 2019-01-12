package com.themisinc;

public class Constructor2 {
	
	
	
	public Constructor2(){
		
		System.out.println(" i am a constructor");
  }
	
	
	public void method(){
		
		System.out.println(" I am inside a method");
		
	}
	

	public static void main(String[] args) {
		
		
		Constructor2 c = new Constructor2();
		
		c.method();
		
	}

}
