package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrtolis {

	public static void main(String[] args) {
		
		String [] array ={"hawak", "robin"};
		
		//List <String> list = Arrays.asList(array);
		
		
		List <String> list = new ArrayList<>();
		
		list.add(array[0]);
		
		list.add(array[1]);
		
		List <String> list1 = Arrays.asList(array);
		
		for(String b : list1){
			
			
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
