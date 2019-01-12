package sample;

import java.awt.List;
import java.util.ArrayList;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList<String>al  = new ArrayList<String>();
		
		//List<String>list = new ArrayList<>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.remove(0);
		al.set(0, "Rajitha");
		
		
		System.out.println(al);
		
		//System.out.println(al);
		
		//for(String obj:al){
			
		//	System.out.println(obj);
		//}
		
		
		for(int i=0 ; i<al.size();i++){
			
			System.out.println( al.get(i));
		}
		

	}

}
