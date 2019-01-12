package com.learn.java.hackerrank;

import java.util.Scanner;

public class Palandrome1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string");
		String str =sc.next();
		String reverse= "";
		 
		System.out.println(str.length()-1);
		  
		 System.out.println(str.charAt(4));
		  
		  for(int i=str.length()-1; i>=0 ;i--){
		      
			   reverse= reverse+str.charAt(i);
		  } 
			   System.out.print(reverse);
			   System.out.println(" ");
			  if(str.equals(reverse)){
				   System.out.println("palandrome");
			   }else{
				   System.out.println("Not Palandrome");
			   }
			  
			   
			   
			  }
}
		     


