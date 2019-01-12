package com.learning.Test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maint {

	public static void main(String[] args) {
		
		HashMap <String,String> m = new HashMap<String, String>();
		
		m.put("ravi", "3098259364");
		m.put("rajani", "469234765");
		
		m.put("rajitha", "356721345");
		
		m.put("rajani", "4567890123");
// it maintains no order, contains values based on the key, contains only unique elements
		
		for(Map.Entry m1: m.entrySet()){
			
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		
		
		
		
		
		
	}

}
