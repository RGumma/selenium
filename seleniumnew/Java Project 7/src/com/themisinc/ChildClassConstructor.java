package com.themisinc;

public class ChildClassConstructor  extends ParentclassConstructor{
	
	ChildClassConstructor(){
		
		this(10);
	System.out.println("Parent class 0- arg cons");	
		
	}
	
	ChildClassConstructor(int a){
		
		super();
		System.out.println("1 arg constructor");
		
	}
		
		
	public static void main(String[] args) {
		
		ChildClassConstructor c = new ChildClassConstructor();
	
	}

}
