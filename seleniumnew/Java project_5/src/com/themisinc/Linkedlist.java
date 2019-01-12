package com.themisinc;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		//System.out.println(al.size());
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
	}

}
