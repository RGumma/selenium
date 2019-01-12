package com.learning.Test1;

import java.util.LinkedList;

public class Linkli {

	public static void main(String[] args) {
		
		LinkedList<String>al = new LinkedList<String>();
		
		al.add("kota");
		al.add("Ravi");
		al.add("Rajani");
		al.add("kota");
		al.add("Ravi");
		al.add("Rajani");
		al.add("kota");
		al.add("Ravi");
		al.add("Rajani");
		al.add("kota");
		al.add("Ravi");
		al.add("Rajani");
		System.out.println(al.size());
		al.add("kota");
		al.add("Ravi");
		al.add("Rajani");
		al.add("kota");
		al.add("Ravi");
		al.add("Rajani");
		
		al.addFirst("vasisht");
		al.addLast("kiran");
		
		al.getFirst();
		al.getLast();
		
		System.out.println(al);
		
		System.out.println(al.indexOf("kiran"));
		
		al.set(2, "priya"); // replace
		
		System.out.println(al);
		
		
		
		
		System.out.println(al.removeFirst());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
