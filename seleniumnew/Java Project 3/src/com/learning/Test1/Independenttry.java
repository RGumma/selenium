package com.learning.Test1;

public class Independenttry {

	public static void main(String[] args) {
		
		try{
			
			System.out.println("hi ratan");
			
			System.out.println(10/0);
			}
		catch(ArithmeticException e){
			
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e){
			
			e.printStackTrace();
		}
		
		
		  
		
		

	}

}
