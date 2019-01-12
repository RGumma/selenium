package themisinc;

import java.util.ArrayList;
import java.util.Collections;

public class Updatespecificarrayelement {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Kota");
		list.add("Gummadidala");
		list.add("Perala");
		
		System.out.println(list);
		
		list.set(0, "Pranavi");
		
		System.out.println("after updating" +list);
		
		list.remove(2);
		
		System.out.println("After removing the elements" +list);
		
		
		Collections.sort(list);
		
		System.out.println("After sorting" +list);
		
		if(list.contains("Gummadidala")){
			
		 System.out.println("Found the element in an array");
		 
	}else{
		
		System.out.println("element was not found");
	}
		
		
		
		

	}

}
