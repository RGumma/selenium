package themisinc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {


		 LinkedList<String> list = new LinkedList<String>();
		 
		 list.add("Red");
		 list.add("Green");
		 list.add("Brown");
		 list.add("White");
		 
		 System.out.println("Printing the list" +list);
		 
		 for(String element :list){
			 
			 
			 System.out.println(element);
		 }
		 
		 Iterator it = list.iterator();
		 
		 while(it.hasNext()){
			 
			 
			 System.out.println(it.next());
		 }
		 
		 
		 list.add(0, "Pink");
		 
		 System.out.println("The elements in the arrat are " +list);
		 
		 
		 list.addLast("Orange");
		 
		 System.out.println("The elements in the list are" +list);
		 
		 list.offerLast("blue");
		 
		String firstelement= list.getFirst();
		
		String lastelement = list.getLast();
		
		System.out.println("Last element is" +lastelement);
		 
		System.out.println("First element is " +firstelement );
		 
		System.out.println("The elements in the list are" +list);
		 
		 
		 Iterator it1 = list.descendingIterator();
		  
		 while(it1.hasNext()){
			 
			 
			 System.out.println(it1.next());
		 }
		 
		 
		 
		 
		 System.out.println("The element in the the reverse order" +list);
		 
		 

	}

}
