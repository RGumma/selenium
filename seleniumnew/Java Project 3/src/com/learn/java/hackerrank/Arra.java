package com.learn.java.hackerrank;

import java.util.Scanner;

public class Arra {

	public static void main(String[] args) {
		
		int A[] = {1,2,3};
		
		int b[];
		 
		//System.out.println(A.length);
		
		//for(int i=A.length-1; i>=0; i--){
			
			//System.out.print(A[i]+ " ");
		
		//}
		
		//for(int i=0; i>=A.length;i++){
			
			//System.out.print(A[i]);
			
		//}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number");
		
		int n= sc.nextInt();
		
		 int arr[] = new int[n];
		 
	    //arr = new int []{1,2,3,4};
		 
		
	       // sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    
	    for(int i=0; i<n ; i++){
	    	
	    	
	    	arr[i]= sc.nextInt();
	    	
	    	System.out.println(arr[i]);
	    	
	      	
	    
	    } 
	    
	    
	    	
	    }
	    
	}
	
	
		
	


