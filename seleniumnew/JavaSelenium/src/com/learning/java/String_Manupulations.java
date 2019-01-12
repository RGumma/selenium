package com.learning.java;

public class String_Manupulations {

	public static void main(String[] args) {
		
		String s1 = "ratan";
		
		String s= s1.concat("vasisht");
		
		System.out.println(s);
		
		String s2 = "anu";
		
		String s3 = "ratan";
		
		String s4 = "Ratan";
		
		System.out.println(s1==s4);
		
		
		String s11 = new String("Rajani");
		
		String s22 = new String("Ravi");
		
		String s33 = new String("Rajani");
		
		System.out.println(s11==s33);
		
		StringBuffer sb = new StringBuffer("Rajani");
		
		sb.append("Ravi");
		
		System.out.println(sb);
		
		System.out.println(s1);
		
		
		
		
		
		
		
		
		

	}

}
