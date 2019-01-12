package com.themisinc;

public class ClassC  extends ClassB{
	
	void m5(){
		
		System.out.println("Methods of m5");
	}
	
   void m6(){
	   
	 System.out.println("Methods of m6");  
   }
	
	public static void main(String[] args) {
		
		ClassC c1 = new ClassC();
		
		c1.m5();
		
		c1.m6();
		
		c1.m3();
		
		c1.m4();
		
		c1.m1();
		c1.m2();
		
		
	}

}
