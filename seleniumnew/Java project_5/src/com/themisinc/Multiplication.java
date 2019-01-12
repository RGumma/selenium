package com.themisinc;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		String value = sc.next();
		System.out.println(value);
		if (!value.matches("[0-9]+")) {
			
			System.err.println("Invalid value");
			throw new Exception("Input value is not a numeric");
		}

		int j = Integer.valueOf(value);
		for (int i = 1; i <= 10; i++) {

			int k = j * i;

			System.out.println(String.format("%d * %d = %-5d", j, i, k));
		}
	}
}