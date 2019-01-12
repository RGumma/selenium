package com.learning.java;

public class Bike {
	
	void run(){
		
		System.out.println("running");
		
	}
	
	class Splender extends Bike{
		
		void run(){
			
			System.out.println("running safely with 60 km");
}
	
	}	
		
		public static void main(String[] args) {
	
	 Bike a1 = new Splender();
	  
	  a1.run();
	  
		}
	}

