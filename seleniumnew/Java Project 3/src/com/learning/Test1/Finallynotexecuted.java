package com.learning.Test1;

public class Finallynotexecuted {

	public static void main(String[] args) {
		
		System.out.println(10/0);
		
		try{
			
			System.out.println("try");
		}
		
		catch(ArithmeticException e){
			
			System.out.println("catch");
		}
		
		finally{
			
			System.out.println("finally");  //control is not entered in try block the corresponding finally block is not executed.
		}
		
		
		

	}

}
