package com.learning.java;

public class ChecknoisPalandrome {

	public static void main(String[] args) {
		
		String  str = "radar";
		
		String reverese = " ";
		
		for(int i= str.length()-1; i>=0; i--){
			
			 
			 reverese= reverese+str.charAt(i);
			
		}
		
		System.out.println(reverese);
			 if(str.equals(reverese)){
				 
				System.out.println( "is a palndrome") ;
			 }else{
				 
				 System.out.println( "is not a palandrome");
			 
			 
		}
		
		
		
		
		

	}

}
