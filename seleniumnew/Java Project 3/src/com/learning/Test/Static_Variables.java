package com.learning.Test;

public class Static_Variables {
	

	static int value;
	
	static int a =20;
	
	static int b =30;
	
	int p =40;
	
	int c = 50;

	public void m3(){
	
		System.out.println(p);
		
		System.out.println(c);
		
		
		System.out.println(Static_Variables.a);
		
		System.out.println(Static_Variables.b);
	
	}
	
	
	public static void m4(){
		
	System.out.println(Static_Variables.a);
	
	Static_Variables a =new Static_Variables();
	
	System.out.println(a.p);

		
	}
	
	
	
	public static void m5(){
		
		Static_Variables a =new Static_Variables();
		
	a.p = value;
		
	System.out.println(value);	
		
	}
	
	

	public static void main(String[] args) {
		
		//System.out.println(Static_Variables.a);
		
		Static_Variables a = new Static_Variables();
		
		//a.m1();
		
		//a.m2();
		
		//a.m3();
		
		Static_Variables.m4();
		
		//System.out.println(a.c);
		
		a.m5();
		
		
		
	}
	
	public void m1(){
		
		int r=30;
		
	System.out.println(Static_Variables.a);	
	
	System.out.println(r);
		
	}
	
	public static void  m2(){
		
		Static_Variables a = new Static_Variables();
		
	   System.out.println(a.p);
		
	}
	
	

}
