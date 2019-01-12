package sample;

import java.util.ArrayList;
import java.util.List;

public class AddingitemsinList {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		
		list.add("birds");
		 list.add("robin");
		 
		 list.set(0, "Rajani");
		 
		 list.remove(0);
		 
		 for(String s : list){
			 
			System.out.println(s); 
			 
		 }
		 
		 
		 
		 
		 
		
				
		
		

	}

}
