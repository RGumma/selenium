package javapackage;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		if (value % 2 == 0) {

			System.out.print("even number");
		} else {

			System.out.print("odd number");
		}

	}

}
