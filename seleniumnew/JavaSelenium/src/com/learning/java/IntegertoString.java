package com.learning.java;

public class IntegertoString {
	
	
	
	

	public static void main(String[] args) {
		 
		String str = "AaBcDb";
		
		 String result = " ";
		
		for(int i=0; i<str.length();i++){
			
		 Character ch = str.charAt(i);
		
		boolean b1=  Character.isLowerCase(ch);
		 
		  if(b1==true){
			  
			result = result+ch;
			  
			}
		}	
	    System.out.println(result);
		
}				
				
}		
		
