package com.learning.Test;

public class Abstract_class_child_constr extends Abstract_class_const{
	
	
	void m1() {
	
	System.out.println("m1 method");
		
	}

Abstract_class_child_constr(){
	
	super();
	
System.out.println("I am in child constrctor");	
	
}

public static void main(String[] args) {
	
	Abstract_class_child_constr t = new Abstract_class_child_constr();
	
	t.m1();	
	
	
	

	}
}
