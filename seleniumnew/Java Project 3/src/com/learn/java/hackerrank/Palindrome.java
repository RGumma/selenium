package com.learn.java.hackerrank;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "radar";
		String rev= "";
		
		for(int i= str.length()-1; i>=0; i--){
			
			rev = rev+str.charAt(i);
		}  
		System.out.println(rev);
		if(str.equals(rev)){
			
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a palindrome");
	           
		}
	}
}