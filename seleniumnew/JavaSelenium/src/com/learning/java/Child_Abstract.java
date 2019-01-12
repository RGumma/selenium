package com.learning.java;

abstract class Child_Abstract extends Abstract_class {

	public void method4() {

		System.out.println("I am in method4");

	}

	public static void main(String[] args){
		
		
		String name = "Rajani";
		
	  String s1= name.substring(4);
	  
	  System.out.println(s1);
	  
	  
	  String s2 = name.substring(2, 4);
	  
	  System.out.println(s2);
	  
	  
	byte[] arr= name.getBytes();
	
	for(int i =0; i<name.length(); i++){
		
		
		System.out.println(arr[i]);
		
		
		String name1 = "Rajitha";
		
	char ch []=	name.toCharArray();
	
 String name2 = "This a programming language in java";
		
		int start = 7;
		
		int end = 17;
		
		char buff [] = new char[ end - start];
				
			name2.getChars(start, end, buff, 0);	
				
				
	}		
		
		
		
		
}
		
		
		
		
		
		
		
		
	
	  
	  
	  
	  
	  
	  
	  
	  
	   
		
	}
	
}
