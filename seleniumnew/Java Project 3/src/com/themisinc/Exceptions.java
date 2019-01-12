package com.themisinc;

public class Exceptions {
	
	public static void main(String args[]){
	
		int i=0; int j=10;

		try{
	
	    j=j/i;
     
		}
		
		
		catch(ArithmeticException e){
	
	 System.out.println(e);	
			
		}


}
}