package com.learn.java.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Datastructur {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//System.out.println("enter the number");
		int n = in.nextInt();
		Map<String, String> hm = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			//System.out.print("Enter name phone pair");
			in.nextLine();
			String namephonepair = in.nextLine();
			System.out.println(namephonepair.length());
			String[] tokens = namephonepair.split(" ");
			hm.put(tokens[0],tokens[1]);
		}	
		
		String search=null;
		while(null !=(search=in.next())){
			
			if(hm.containsKey(search)){
				
				System.out.println(search+"="+hm.get(search));
			}else{
				
				System.out.println("Not found");
			}
		}
		// System.out.println(hm);
			/*for (Map.Entry<String, String> entry : hm.entrySet()) {
				if (hm.containsKey(null)) {
					System.out.println("Not found");
				} else {
					String key = entry.getKey();
					String value = entry.getValue();
					System.out.println(key + "=" + value);
				}
			}*/

	}

}
