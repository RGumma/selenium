package com.learning.Test;

public class Test3 {
	
	int a =10;
	
	int b =20;
	
	static int c = 30;
	

	public static void main(String[] args) {
		
		Test3  t = new Test3 ();
		
		System.out.println(t.a);
		
		System.out.println(t.b);
		
		System.out.println(Test3.c);
		
		
		Test3 t1 = new Test3();
		
		t1.a=30;
		
		t1.c=50;
		
		System.out.println(t.a);
		
		System.out.println(t1.c);
				
		
		
		
		
	}

}
