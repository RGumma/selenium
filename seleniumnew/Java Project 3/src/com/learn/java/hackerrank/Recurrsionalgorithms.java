package com.learn.java.hackerrank;

public class Recurrsionalgorithms {
	
	public static int factorial(int n){
	    if(n<=1){
	    	
	    	return 1;
	    }else{
	    	
	       return n*factorial(n-1);
		}
		
	}

	public static void main(String[] args) {
		factorial(4);
		
		

	}

}
