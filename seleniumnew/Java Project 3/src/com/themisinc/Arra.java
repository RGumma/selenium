package com.themisinc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Arra {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		LinkedList<String> ll = new LinkedList<>();
		ll.
		
		
		al.add("Rajani");
		
		al.add("Rajitha");
		al.add("Rajitha");
		
		al.add("Ravi");
		al.set(1, "sushma");
		
	   String a[] = al.toArray(new String[4]);
	   
	   String b[] = {"Rajani", "rajitha", "ravi"};
	   
	   ArrayList<String> as = new ArrayList<>(Arrays.asList(b));
	   
	   for(int i =0 ; i<as.size(); i++){
		   
		   System.out.println(as.get(i));
	   }
	   
	   
		
	   System.out.println(a.length);
	   for(int i=0 ; i< a.length; i++){
		   
		   System.out.println(a[i]);
	   }
	   
	   
		
  
		
	}

}
