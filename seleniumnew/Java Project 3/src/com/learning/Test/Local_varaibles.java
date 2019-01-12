package com.learning.Test;

public class Local_varaibles {
	
	int p =10;
	
	int q =30;
	
	
	public void m1(){
		
		int a =10; //local varaible
		
		System.out.println(q);
		
		System.out.println(a); // possible 
	}
	
	public void m2(){
		
		System.out.println(a); // not possible 
		
	}
	
	
public static void main(String[] args) {
	 
	 Local_varaibles lv = new Local_varaibles();
	 
	 lv.m1();
	 
	 System.out.println(lv.p);
	 
	 
		
		//int a =10;
		
		//int b =20;
		
		//System.out.println(a+b);
		
		
		
	}

}
