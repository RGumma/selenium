package com.learning.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList <String> obj1 = new ArrayList<String>();

		//obj1.add(10);

		//obj1.add("rajani");

		//obj1.add("selenium");

		//obj1.add(12.34);

		//obj1.add("selnium");
		
		obj1.add("Rajani");
		obj1.add("Rajitha");
		obj1.add("Pallavi");
		
		
		
		
		
		
		

		// System.out.println(obj1);

		/*
		 * for(int i=0; i<obj1.size(); i++){
		 * 
		 * 
		 * System.out.println(obj1.get(i));
		 * 
		 * }
		 */

		/*
		 * for(Object abc: obj1){
		 * 
		 * 
		 * System.out.println("values in the list are" +abc); }
		 */

		Iterator it = obj1.iterator();

		while (it.hasNext()) {

			Object value = it.next();
			
			System.out.println(value);

		}

	}

}
