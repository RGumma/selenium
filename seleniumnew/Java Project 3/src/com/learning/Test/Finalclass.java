package com.learning.Test;

final public class Finalclass {
	
	int a =100;  // final class varaibles are not a final 
	
	void m1(){ // final class methods are final by default
		
		a= a+10;
		
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		Finalclass cv = new Finalclass();
		
		cv.m1();
	}

}
