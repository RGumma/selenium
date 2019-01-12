package com.learning.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<String> values = new HashSet<>();
		
		values.add("Selenium");
		values.add("QTP");
		values.add("winium ");
		values.add("Mukesh");
		values.add("abc");
		
		System.out.println(values);
		
		ArrayList<String> al = new ArrayList<String>(values);
		
		System.out.println(al.get(3));
		
		
		for(String e : values){
			
			
			System.out.println("values are " +e);
		}
		
		
		
		
		
		
		
		
	}

}
