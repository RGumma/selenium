package com.themisinc;

public class Dog4 extends Animal{

	void eat(){
		
		
		System.out.println("eating bread");
		

	}

	
	
	void bark(){
		
		
	System.out.println("barking");	
		
	}
	
	
	void work(){
		
		super.eat();
		
	}
	
	
	public static void main(String args[]){
		
		
		Dog4 d = new Dog4();
		
		d.work();
		
		
		
		
		
	}
}



