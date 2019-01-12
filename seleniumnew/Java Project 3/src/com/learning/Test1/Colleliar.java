package com.learning.Test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Colleliar {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Prudhvi");
		al.add("Rajani");
		al.add(1,"Rajitha");  // characteristics of Arraylist  maintain the insertion order
       al.add(null);//null insertion is allowed, duplicates are allowed.
		al.add("Prudhvi");
		Collection collection = new ArrayList();
		
		collection.add("rajani");
		collection.add("rajitha");
		al.addAll(collection);
		
		System.out.println(al);
		
		
		//al.add(10);
		
		//al.add(10.5);
		
		System.out.println(al);
       
		System.out.println(al.get(1));
		//System.out.println(al.size());
		System.out.println(al.contains("Prudhvi"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(1));
		//System.out.println(al.size());
	//al.set(2, "vasisht");
		
	
		//for(String abc : al){
			
			//System.out.println(abc);
		//}
		
		
		
		
		
		
		
		
		

	}

}
