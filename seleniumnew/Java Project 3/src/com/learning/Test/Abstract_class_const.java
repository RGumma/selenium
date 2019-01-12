package com.learning.Test;

abstract public class Abstract_class_const {
	
	abstract void m1();
	
	Abstract_class_const(){
		
		
		System.out.println("Abstract class constructor");
	}
	
	{
		
		System.out.println("Instance block");
	}

	static{
		
		System.out.println("static block");
	}
	
	
}
