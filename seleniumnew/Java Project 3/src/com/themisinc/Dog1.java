package com.themisinc;

public class Dog1 extends Animal3{
	
	String color = "black";
	
	void printcolor(){
		
		System.out.println(color);
		System.out.println(super.color);
		
	}

	
	
		
		public static void main(String args[]){
			
			Dog1 d = new Dog1();
			d.printcolor();
			
			
		}
	}

