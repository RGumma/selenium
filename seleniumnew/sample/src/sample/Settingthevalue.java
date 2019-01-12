package sample;

import java.util.ArrayList;
import java.util.List;

public class Settingthevalue {

	public static void main(String[] args) {
		
		
		List<String>birds = new ArrayList();
		
		birds.add("hawk");
		
		System.out.println(birds.size());
		
		birds.set(0, "robin");
		
		System.out.println(birds.size());
		
		//birds.set(1, "robin");
		
		birds.remove(0);
		
	     

	}

}
