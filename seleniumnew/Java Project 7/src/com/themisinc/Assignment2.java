package com.themisinc;

public class Assignment2 {
	
	int a=10;
	int b=20;
	
	static int d=20;
	static int e=10;
	
	
	public  void m1(){
		
	System.out.println("Varaibles are" + a);
	
	System.out.println("varaibles are" +b);
	
	System.out.println("static varaibles" + d);
	
	System.out.println("static varaiables" +e);
	}
 static void method12(){
		
		System.out.println("varaibles" + d);
		
		System.out.println("variables are" + e);
		
		//System.out.println("varaibles are" +a);// compilation error
		
		}
	 public static void main(String[] args) {
	   
	   Assignment2 a = new Assignment2();
	   
	   a.m1();
	   
	   Assignment2.method12();
		

	}

}
