package com.learning.Test;

public class SuperChild extends Superparent{
	
	public void m1(){
		
	System.out.println("Child class m1 mthod");	
		
	}
	
	public void m2(){
		
		this.m1();
		
		super.m1();
		
	}

	public static void main(String[] args) {
		
		SuperChild sc = new SuperChild();
		
		sc.m2();
		
	}

}
