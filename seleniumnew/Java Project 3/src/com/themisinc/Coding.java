package com.themisinc;

public class Coding {
	
	
	public static void main(String[] args){
		
		StringBuilder s1= new StringBuilder("Java");
		String s2 = "Love";
		System.out.println(s1.append(s2));	
		System.out.println(s1.substring(4));
		System.out.println(s1);
		System.out.println(s2);
		
		
		int foundAT = s1.indexOf(s2);
		System.out.println(foundAT);
	
		
	}

}
