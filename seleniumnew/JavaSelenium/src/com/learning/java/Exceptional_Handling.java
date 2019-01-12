package com.learning.java;

public class Exceptional_Handling {
	
	
	public void  division(int a, int b){
		
		try{
		int c = a/b;
		}catch(ArithmeticException Exception ){
		  
		System.out.println("Exceptional is handled");
		
		}finally{
			System.out.println("run for sure");
		}
	}

	public static void main(String[] args) {
		
		Exceptional_Handling a1 = new Exceptional_Handling();
		
		a1.division(10, 0);
		
		
	
	
	}
	
}
	

