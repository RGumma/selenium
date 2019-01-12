package com.themisinc;

public class ChildclassVariables  extends Parentvariables {
	
	int a =10;
	
	int b= 20;
	
	
	public void method1(int a , int b){
		
		System.out.println("Local varaibles" + (a+b));
		
		System.out.println("Instance varaibles" +(this.a+this.b));
		
		System.out.println("Parent class varaibles" + (super.a +super.b);
	}
	 
	public static void main(String[] args) {
		
		

	}

}
