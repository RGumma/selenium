package com.themisinc;

import java.util.Scanner;

public class Uppertolower {

	public static void main(String[] args) throws Exception {
		
		System.out.println("enter the string");
		
		Scanner sc = new Scanner(System.in);
		 String value= sc.next();
		 
		 if(value==null){
			 
			 System.err.println("no value is entered");
			 
			 throw new Exception("string is not valid");
		 }
		
		 
		 
		  for(int i= 1; i<=value.length(); i++){
			 
			 if( i %2!=0){
				 
			char s=value.charAt(i);
			
			
				 
			 }
			 
			 
		 }
		 
	}

}
