package themisinc;

import java.util.ArrayList;
import java.util.Collections;

public class Copyfromonelisttoanother {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
	     
		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println("List is" +list);
		
		ArrayList<String>list1 = new ArrayList<String>();
		 
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		System.out.println("new list is" +list1);
		
		Collections.copy(list, list1);
		
		System.out.println("After copy " +list);
		
		System.out.println("After copy" +list1);
		
		
  
	}

}
