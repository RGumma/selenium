package com.themisinc;

import java.util.LinkedList;

public class Linkedli {

	public static void main(String[] args) {
		
		LinkedList <String> al = new LinkedList<>();
		
		al.add("Rajani");
		
		al.add("Rajitha");
		
		System.out.println(al);
		
	    al.addFirst("Ravi");
	    
	    System.out.println(al);
	    
	    System.out.println(al.size());
	    
	    System.out.println(al.get(1));
	    
	    System.out.println(al);
	    
	    System.out.println(al.getFirst());
	    
	    System.out.println(al.remove(1));
	    
	    System.out.println(al);
	    
	
		

	}

}
