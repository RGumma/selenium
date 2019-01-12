package com.learn.java.hackerrank;

public class Reverse {

	public static void main(String[] args) {
		
		//String str = "rajani";
		
		//char ch[] = str.toCharArray();
		
		//for(int i=ch.length-1; i>=0; i--){
			
		   // System.out.println(ch[i]);
       //}
		
		//factoraial of a given number 
		
		//int fact = 1;
		//for(int i= 5;  i>0 ; i--){
			
			//fact = fact*i;
			
			//System.out.println(fact);
		//}
		
		
		String str = "radar";
		
	    String reverse = " ";
	    
	    for(int i=str.length()-1 ; i>=0; i--){
	    	
	    	reverse =reverse+str.charAt(i);
	    	
	    	 }
	    
	    System.out.println(reverse);
	    
	    if(str.equals(reverse)){
	    	
	    	
	    	System.out.println("yes palandrome");
	    }else{
	    	
	    	System.out.println("not palandrome");
	    }
	    
	    
		
		
		
		
	}

}
