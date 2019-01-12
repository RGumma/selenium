package com.learn.java.hackerrank;

public class Average {
	
	public static int a=10;
	
	int b=20;// instance varaibles cannot be used in static context
	
	public static void name(){
		
		System.out.println(a);
		
		Average a= new Average();
		System.out.println(b);
		
	}
	
	
	public void display(){
		
		System.out.println(a);
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
			Average a = new Average();
		a.display();
		System.out.println(Average.a);
		
		
		

	}

}
