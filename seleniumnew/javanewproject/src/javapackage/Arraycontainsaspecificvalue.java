package javapackage;

import java.util.ArrayList;
import java.util.List;

public class Arraycontainsaspecificvalue {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30 };

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (l.contains(20)) {

				System.out.print("true");

			}

		}

	}

}
