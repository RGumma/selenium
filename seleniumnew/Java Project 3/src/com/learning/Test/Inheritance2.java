package com.learning.Test;

public class Inheritance2 extends Inheritance11 {

	void m5(){
		
		System.out.println("I am in m5 method");
	}
	
	
	void m6(){
		
		System.out.println("I am in m6 method");
		
	}
	
	public static void main(String[] args){
		
		Inheritance2  in = new Inheritance2();
		
		in.m2();
		
		in.m4();
		
		in.m1();
		
		in.m2();
		
		Inheritance11 i = new Inheritance11();
		
		i.m1();
		
		i.m2();
		
		i.m3();
		
		i.m4();
		
		
		
	}
	
	}


