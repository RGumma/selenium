package com.themisinc;

import java.util.Scanner;

public class EvenorOdd {

	 
	public static void main(String[] args) throws Exception {
		
		System.out.println("enter the value :");
		Scanner sc = new Scanner(System.in);
	    String value = sc.next();
	       
	     if(!value.matches("[0-9]")){
            	
            System.err.println("invalid value");
	    	 
           throw new Exception("value is not numeric");
	     }
            
	    int i=Integer.parseInt(value);
	    
	    int j;
           
        j= i %2;

		if (j == 0) {

			System.out.println("even number");

		} else {

			System.out.println("odd number");
		} 
	}
}
	


