package com.learning.java;

public class Palindrom {
	
  
	int r, sum=0;
	 int n;
	 
	int temp=n;
	
 
	 public void palindrome(int n ){
		
		while(n>0){
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		
		if(temp==sum){
			
			System.out.println("palindrome");
		}
		
		else{
			
			System.out.println(" not a palindrome");
			
			
		}	
			
		}
		
		
	
		
		
		
		
		
	}
	
	

