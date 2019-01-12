package com.learning.java;

import java.util.Arrays;

/**
 * This program deals with different string operations
 * 
 * @author Rajani
 */
public class CustomStringUtils {

	private final char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	
	public String reverseVowels(String value){

		StringBuilder result = new StringBuilder();
		Arrays.sort(vowels);
		for(int i=0;i<value.length();i++){
			
			char ch = value.charAt(i);
			if(Arrays.binarySearch(vowels, ch)>=0){
				
				result.append(ch);
			}
			/*if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			   ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				
				result.append(ch);
			}*/
		}
		System.out.println("Vowels are ->"+result);
		System.out.println("Reverse of vowels are ->"+result.reverse());
		return (result.length()==0?null:result.toString());
	}
	
	public static void main(String...args){
		
		CustomStringUtils utils = new CustomStringUtils();
		utils.reverseVowels("BCDF");
	}
}
