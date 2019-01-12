package com.themisinc;

public class overloaded  {
	
	void m1(int a){
		
		System.out.println("m1 method");
		
	}
	
	void m1(int a, int b){
		
		System.out.println(" m1 methods ");
	}
	
	void m1(char c){
		
		
		System.out.println("char overloaded methods");
	}
	

	public static void main(String[] args) {
		
		
		overloaded o = new overloaded();
		
		o.m1(10);
		
		o.m1(10, 20);
		
		o.m1('a');
		

	}

}
