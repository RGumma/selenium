package com.themisinc;

public class Complete_Class {

	int x = 5;

	int y = 20;

	static int a = 10;
	

	static int b = 20;

	public void method1() {

		int a = 10;

		System.out.println("I am in  instance method1" + a);
	}

	static void method2() {

		int x = 10;

		System.out.println("I am in static method" + x);

	}

	{

		System.out.println("Instance block");
	}

	static

	{

		System.out.println("static block");

	}

	static {

		System.out.println("static block 1");
	}

	Complete_Class() {

		System.out.println("I am in constructor");

	}

	Complete_Class(int a) {

		System.out.println(" I am in 1 -arg constructor");

	}
	
	Complete_Class(int a, int b){
		
		System.out.println("I am in 2-arg constructor");
		
	}

	public static void main(String[] args) {
		
		System.out.println(Complete_Class.a);

		Complete_Class c = new Complete_Class();
		System.out.println(c.x);
	     
		Complete_Class c1 = new Complete_Class(10);
		
		Complete_Class c2 = new Complete_Class(10, 20);

	}

}
