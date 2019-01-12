package com.themisinc;

public class Removewhitespaces {

	public static void main(String[] args) {
		
		String s = " Rajani is a good girl";
		
		String a= s.replaceAll("\\s", "");
		
		System.out.println(a);
	}

}
