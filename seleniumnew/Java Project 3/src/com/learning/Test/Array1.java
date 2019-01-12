package com.learning.Test;

public class Array1 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };

		System.out.println(a[0]);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		for (int aa : a) {

			System.out.println(aa);

		}

	}

}
