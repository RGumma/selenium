package com.learn.java.hackerrank;

public class Counttheocurrences {

	public static void main(String[] args) {
		
		String str = "rajani is good girl rajani";
		
		int count = 1;
		
	  String words []= str.split(" ");
	  
	  for(int i =0; i<words.length ; i++){
		  
		  for(int j=i+1; j<words.length; j++){
			  
			  if(words[i].equals(words[j])){
				  
				  count = count+1;
				  
				  words[j]="0";
			}
			  
		  }  
			if(words[i]!="0"){
				
				System.out.println(words[i]+ " "+ count);
				
				count =1;
			}
		 }
		
		
		

	}

}
