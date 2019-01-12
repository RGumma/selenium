package com.learning.java;

import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the alphabet");
		 
		String input = sc.next();
		
		 //if(( c >= 65 && c <=90)|| (c >=97 && c <=122)){
			 
			// System.out.println( "Not a letter");
		 System.out.println(input.length());
		 
		 if(input.length()>1){
			 
			 
			 System.out.println("Not a single character");
			 
			 
		 
		 } else if (input.equals("a") || input.equals("e") || input.equals("i") ||  input.equals("o")|| input.equals("u")){
			 
			System.out.println("Vowels");
			
		  }else{
				
				
				System.out.println("Its a consonent");
			}
					
		
	}
	
}
			
			
			
		
		
		
		
		
		
		
		
		

	


