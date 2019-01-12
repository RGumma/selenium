package com.learning.Test;

public class Child_Constructor extends Parent_Constrctor {
	
	Child_Constructor(){
		
		this(10);
		
		System.out.println(" child class zer0 arg constructor");
	}
	
	Child_Constructor(int a){
		
		super();
		System.out.println(" Child class  1 arg constructor");
	}

	public static void main(String[] args) {
		
		Child_Constructor c= new Child_Constructor();
		
		
		
	}

}
