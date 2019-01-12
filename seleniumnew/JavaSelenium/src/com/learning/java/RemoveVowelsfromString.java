package com.learning.java;

public class RemoveVowelsfromString {

	public static void main(String[] args) {
		
		String str = "rajani";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			
			if(ch[i]== 'a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				
				ch[i] =  ' ';
				
			}
			
			System.out.print(ch[i]);
		}
		
		

	}

}
