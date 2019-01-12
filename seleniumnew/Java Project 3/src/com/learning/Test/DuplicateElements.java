package com.learning.Test;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String input[] = {"abc", "def" ,"mno", "xyz", "pqr", "xyz", "def"};
		
		System.out.println(input.length-1); 
		
		for(int i =0; i< input.length-1; i++){
			
			for(int j= i+1; j<input.length; j++){
				
				
				if ((input[i].equals(input[j])&&(i!=j))){
						
					
					System.out.println("duplicate element is"+input[j]);
						}
			}
		}
		
		
	}

}
