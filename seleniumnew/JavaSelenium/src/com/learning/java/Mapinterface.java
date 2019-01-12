package com.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapinterface {

	public static void main(String[] args) {
		
		
		//Map <String, String> m = new HashMap<>();
		
		//HashMap <String, String> m = new HashMap<>();
		
		//m.put("Ravi", "3098259364");
		
		//m.put("prabha" ,"2149366578");
		
		//m.put("prabha", "2149366578");
		
		//System.out.println(m);
		
		//Set <String> a = new HashSet<>();
		
		//LinkedHashSet <String> values = new LinkedHashSet<>();
		
		//values.add("Rajani");
		
		//values.add("Rajitha");
		
		
		String stringarr[] = {"sun, Mon" , "Tue"};
		
		integer arr[] = {2, 3, 4, 5};
		
		List<String> al = Arrays.asList(stringarr);
		
		List <integer>= Arrays.asList(arr);
		
		System.out.println(al);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		
		list.add(2);
		
		Integer intarr[] = new Integer[list.size()];
		
		list.toArray(intarr);
		
		for (Integer integer : intarr){
			
			System.out.println(integer);
			
		}
		
		//a.add("Rajani");
		
		//a.add("Rajitha");
		
		//for(String values :a){
			
			//System.out.println(values);
		//}
		
		//Iterator<String> it = a.iterator();
		
		//while(it.hasNext()){
			
			//System.out.println(it.next());
		//}
		
		
		//System.out.println(a);
		
		//ArrayList<String> al = new ArrayList<>(a);
		//System.out.println(al);
		
		
		
		
		
		/*m.put("null", "null");
		
		m.put("null", "null");
		
		System.out.println(m.get("Ravi"));
		
		System.out.println(m.remove("Ravi"));
		
		for(Map.Entry<String, String> hm : m.entrySet()){
			
			System.out.println(hm.getValue()+ " "+ hm.getKey());
		}/*
		
		
		
		/*m.put("Rajani", "9290168267");
		
		m.put("Rajitha", "469-343-9677");
		
		System.out.println(m.get("Rajani"));
		
		System.out.println(m.remove("Rajitha"));
		
		for(Map.Entry<String, String> e : m.entrySet()){
			
		System.out.println(e.getValue()+ " "+e.getKey());
		}*/
		
		
}
	
}
