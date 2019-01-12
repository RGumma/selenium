package com.themisinc;

import java.util.ArrayList;

public class Test1  {

 public static void main(String[] args) {
	 
	 ArrayList <String>  al = new ArrayList<>();
	 
	 al.add("Rajani");
	 al.add("Rajitha");
	 al.add("ravi");
	 al.add("null");
	 al.add("Rajani");
	 
	 System.out.println(al.size());
	 al.add(1, "a");
	 
	 System.out.println(al.size());
	 
	al.remove(0);
	
	System.out.println(al);
	
	al.remove("Rajitha");
	
	al.contains("Rajitha");
	
	System.out.println(al.contains("Rajitha"));
	
	System.out.println(al.isEmpty());
	
	System.out.println(al.get(2));

	 for(String a : al){
		 
		 System.out.println(a);
	 }
	 
	  
	  	
		

	}

}
