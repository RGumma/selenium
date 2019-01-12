package com.learning.Test1;

import java.util.Map;
import java.util.TreeMap;

public class Trema {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> m = new TreeMap<Integer,String>();
		
		m.put(2,"two");
		m.put(1,"one");
		m.put(3,"three");
		m.put(6, "six");
		m.put(5, "five");// it maintains the ascending order //
		m.put(6, "six");
		
		for(Map.Entry m1:m.entrySet()){
			
			
			System.out.println(m1.getKey()+ " "+m1.getValue());
		}
		
	}

}
