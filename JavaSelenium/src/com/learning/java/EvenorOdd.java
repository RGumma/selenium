package com.learning.java;

public class EvenorOdd {

	int even;

	public void evenorodd(int n) {

		even = n % 2;
		if (even == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
	}

}
