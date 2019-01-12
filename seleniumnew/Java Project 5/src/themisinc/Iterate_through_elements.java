package themisinc;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_through_elements {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Ravi");
		list.add("Rajani");
		list.add("kota");
		list.add("Gummadidala");
		list.add("1");

		//System.out.println("The list of the elements are" + list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
