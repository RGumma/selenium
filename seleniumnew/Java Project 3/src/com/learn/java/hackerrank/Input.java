package com.learn.java.hackerrank;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A");
			String A=sc.next();
			System.out.println("Enter the B");
			String B=sc.next();
	        //Enter your code here. Print output to STDOUT. 
	          int p=A.length();
	          int q=B.length();
	          System.out.println(p+q);
	           int d= A.compareTo(B);
	           if(d>=1){
	               System.out.println("Yes");
	            }else{
	               System.out.println("No");
	           }
	           String a= A.substring(0,1).toUpperCase();
	           String h= A.substring(1);
	           String c= B.substring(0,1).toUpperCase();
	           String r= B.substring(1);
	           System.out.println(a+h+" "+c+r); 

	}

}
