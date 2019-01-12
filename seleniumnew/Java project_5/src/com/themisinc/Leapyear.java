package com.themisinc;

import java.util.Scanner;

public class Leapyear {

	public static boolean isLeap(int year){
		
		if(year %4 == 0 && year %100 == 0 && year %400 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("enter the year : ");
		Scanner sc =new Scanner(System.in);
		String value = sc.next();
		
		if(!value.matches("[0-9]+")){
			   
			throw new Exception("not a numeric");
		}
		
		int year = Integer.parseInt(value);
		System.out.println(Leapyear.isLeap(year));     
		
	  /*if(year%4==0){
		
		  if(year % 100 == 0){
			  
		  }
		}if(year==366){
			 
	    }if(year%100==0){
			 
			  System.out.println("year is a leap year");
			   
		    }else{
	    	   
	    	   System.out.println("not a valid year");
	       }*/
	}
	
}
