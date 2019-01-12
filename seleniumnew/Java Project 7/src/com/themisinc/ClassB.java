package com.themisinc;

public class ClassB  extends A{ // child class, derived class
	
	//int c =20;
	public void m3(){
		
		System.out.println("Methods of m3");
	
	}
	
	public void m4(){
		
		System.out.println("Methods of m4");
		
	}
	
	public static void main(String[] args) {
		
		ClassB c = new ClassB();
		System.out.println(c.a);
		c.m3();
		c.m4();
		c.m1();
		c.m2();
	
	}

}
