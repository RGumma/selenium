package com.themisinc;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		//System.out.println("list of the elements in an array list are" + list.size());
		
		//list.remove(2);
		
		//System.out.println(list.size());
		
		Iterator itr = list.iterator();
		  
		  while(itr.hasNext()){
			  
			  System.out.println(itr.next());
		  }
		
	}

 }
