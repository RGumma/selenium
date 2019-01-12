package themisinc;

import java.util.Collections;
import java.util.LinkedList;

public class Displaytheelements {

	public static void main(String[] args) {
		
		LinkedList<String>list = new LinkedList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("white");
		
		System.out.println("The elements in the list are" +list);
		
		list.remove(2);
		
		Collections.swap(list, 0, 1);
		
		System.out.println("After swapping"  +list);
		
		
		for(int i=0; i<list.size(); i++){
			
			
			System.out.println("The position of the elements are" +i +list.get(i));
			
		}
		
		
		
		
	}

}
