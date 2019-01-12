package com.learning.java;

public class CarTest {

	public static void main(String[] args){
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.setModelNumber(123);
		c2.setModelNumber(123);
		
		if(c1==c2){
			
			System.out.println("C1 and C2 are same");
		}else{
			
			System.out.println("C1 and C2 are not same");
		}
		
		System.out.println(c1.equals(c2));
	}
}
