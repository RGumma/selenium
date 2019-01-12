package com.learning.Test1;

public class Trfina {

	public static void main(String[] args) {
		
		try{
			System.out.println("hi anu");
			System.out.println(10/0);
			System.out.println("hi ratan");
		}
		
		finally{
			
			System.out.println("finally"); // try with finally is an abnormal termination because corresponding catch block 
			                             // is not matched
			
			//finally block is to write piece of code .Finally block is always executed.To perform the clean up activities perform the finally block.Code is executed irrepestive of the catch block
		}
		

	}

}
