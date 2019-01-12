package themisinc;

import java.util.ArrayList;
import java.util.Iterator;

public class InsertelementatFirstPosition {

	public static void main(String[] args) {
		
		ArrayList<String>list= new ArrayList<String>();
		list.add("Red");
		list.add("Orange");
		list.add("Black");
		list.add("yellow");
		list.add("Black");
		
		System.out.println("Before adding the elements" +list);
		
		list.add(0, "Green");
		list.add(6, "Brown");
		
		String element= list.get(0);
		
		System.out.println("Retreving the element" +element);
		
		
		System.out.println("After adding the elements" +list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			
			
			System.out.println(it.next());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
