package themisinc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Red");
		
		hm.put(2, "Green");
		hm.put(3, "Black");
		hm.put(4 ,"White");
		

		// for (Map.Entry x : hm.entrySet()) {

		// System.out.println(x.getKey() + " " + x.getValue());

		// }

		// System.out.println("size of the hashmap" + hm.size());

		// hm.clear();

		// System.out.println("The new map:" +hm );

		// boolean result = hm.isEmpty();

		// System.out.println("Is hash map empty: " +result);

		// hm.clear();

		// result = hm.isEmpty();

		// System.out.println("Is hash map empty: " +result);

	//System.out.println("The original map" + hm);

		//if (hm.containsKey("Green")) {

			//System.out.println("Get the key" + hm.get("Green"));

		//} else {

			//System.out.println(" no");

		//}
		
		
		//String val = (String)hm.get(3);
		
		//System.out.println("Value for the key is " +val);
		
		Set keyset = hm.keySet();
		
		System.out.println("key set values are:" +keyset);
      
	}

}
