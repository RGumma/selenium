package com.themisinc;

public class MethodOverrid2  extends  MethodOverrid{
	
	
	private float  method1(float a, int b){
		
		
		
	System.out.println("child class method");
	
	
	return 10.2f;
	}
	

	public static void main(String[] args) {
		
		MethodOverrid2 m1 = new MethodOverrid2();
		
		m1.method1(10.0f, 2);
		
		
		
	}

}
