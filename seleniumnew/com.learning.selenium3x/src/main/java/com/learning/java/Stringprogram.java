package com.learning.java;

public class Stringprogram {

	public static void main(String[] args) {
		
		
		String name = "rajani";
		
		char ch = name.charAt(4);
		
		System.out.println(ch);
		
		
		
		String s1= "hello";
		
		String s2 = "hello";
		String s3 = "meklo";
		String s4= "hemlo";
		String s5 = "flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		
		String s = "java String";
		s.concat("is immutable");
		
		System.out.println(s);
		
		s= s.concat(" is immutable so assign it explicitly");
		System.out.println(s);
		
		
		String r= "ABCDEF";
		byte[] barr =r.getBytes();
		
		for(int i=0; i<barr.length; i++)
		{
			
			System.out.println(barr[i]);
			
			
			
			String j = "RAJANI";
			
			String jlower = j.toLowerCase();
			
			System.out.println(jlower);
			
			
			
		}
		
	}

}
