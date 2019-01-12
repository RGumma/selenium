package com.themisinc;

public class Horse extends Animal{
	
	public void eat(){
		
		System.out.println("Horse is  eating");
		
	}

	
	public static void main(String[] args){
		
		Animal a = new Horse();
		a.eat();
            
		
	}
	
}
