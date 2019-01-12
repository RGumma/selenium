package com.learning.java;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("ravi");
		al.add("Rajani");
		al.add("Vasisht");
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
}

	
		
	}


