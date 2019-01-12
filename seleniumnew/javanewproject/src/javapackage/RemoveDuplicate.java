package javapackage;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int arr[] = { 20, 20, 30, 40, 50, 50 };

		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			s.add(arr[i]);

		}

		System.out.print(s);
		//System.out.print();
		
		

	}

}
