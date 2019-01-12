package com.themisinc;

public class Child_c  extends Parent_c{

	public void method1(){
		
		
		System.out.println("Child_Method ");
	}
	
	
	public void method2(){
		
		
		System.out.println("direct method");
	}
	
	public static void main(String[] args) {
		
		Parent_c p = new Child_c();
		
		//do typecasting 
		
		p.method1();
		
		p.method2();
		
	}

}
