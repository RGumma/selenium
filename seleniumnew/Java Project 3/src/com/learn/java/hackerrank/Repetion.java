package com.learn.java.hackerrank;

import java.util.Scanner;

public class Repetion {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); // rajani
		
		System.out.println("Enter the string");
		
		 String  input = sc.nextLine();
		 
		 int wrc =1;
		 
		String str[] = input.split(" ");
		 
		  for(int i=0; i<str.length; i++){
			  
			for(int j=i+1; j<str.length; j++){
				  
				if(str[i]==str[j]){
					
					str[i]="0";
					str[j]="0";
				
					
				
					
					
					
				}
			}	
				
				  
			  }
		  }
		 
		
		
		

	}


