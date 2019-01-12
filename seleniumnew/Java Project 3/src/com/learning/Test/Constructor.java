package com.learning.Test;

public class Constructor {
	
	public Constructor(int a){
		
		
		System.out.println("I am inside the constructor");
	}
	

	public static void main(String[] args) {
		
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10);
		

	}

}
