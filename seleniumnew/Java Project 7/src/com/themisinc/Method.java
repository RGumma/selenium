package com.themisinc;

public class Method {
	
	class X{}
	class Emp{ }
	class Y { }
	class Student{ }
	
	
	void m1(X x, Emp e)
	
	{
		
		System.out.println("m1 method");
		
	}

	public static void main(String[] args) {
		
		Method m = new Method();
		 
		X x = new X();
		
		Emp e1 = new Emp();
		
		t.m1(x, e1);  
		
		t.m1(new x(), new Emp());
		
		Test.m2(new y(), new student());
		
		
		
		
		
		
		
		

	}

}
