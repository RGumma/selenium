package com.themisinc;

import java.util.ArrayList;

public class Test2 {
	
	
  public static void main(String[] args) {
	  
	  
	  ArrayList<String>al = new ArrayList<>();
	  al.add("Rajani");
	  al.add("Rajitha");
	  al.set(0,"Ravi");
	  al.add("Rajani");
	  al.set(1,"Vasiht");
	  System.out.println(al.get(2));
	  System.out.println(al.get(3));
	  ArrayList <String>al1 = new ArrayList<>();
	  
	  //System.out.println(al1.containsAll("Rajani"));
	  al1.addAll(al);
	  
	  System.out.println(al);
	  
	  System.out.println(al1.containsAll(al));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		

	}

}
