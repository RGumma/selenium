package com.themisinc;

public class Method1 {
	
	void m1(int a, int b){
		
		System.out.println("m1 method");
	}
	
	static void m2(){
		
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		
		Method1 t = new Method1();
		
		 
		t.m1(10, 20);
		

	}

}
