package com.learning.Test;

public class Child_classconstructor extends Parent_Cons3 {
	
	Child_classconstructor(){
		this(10);
		
		System.out.println("child class constr");
	}
	
	Child_classconstructor(int a){
		// compiler generates super keyword;
		
		System.out.println("child class 1 arg");
	}

	public static void main(String[] args) {
		
		Child_classconstructor b = new Child_classconstructor();
		
		Child_classconstructor b1 = new Child_classconstructor(10);
		

	}

}
