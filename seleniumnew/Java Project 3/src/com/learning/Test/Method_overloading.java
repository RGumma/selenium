package com.learning.Test;

public class Method_overloading {
	
	
	public void m1(int a){
		
		System.out.println("Method overoading1");
	}
	
	public void m1(int a , int b){
		
		
		System.out.println("Method overladed 2 ");
		
		}

	public void m1(char a){
		
		
		System.out.println("metho overriding 1");
	}
	
	public static void main(String[] args) {
		
		Method_overloading c = new Method_overloading();
		
		c.m1(10);
		
		c.m1(10, 20);
		
	}

}
