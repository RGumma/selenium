package themisinc;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");

		int a = sc.nextInt();

		System.out.println("Enter the second number");

		int b = sc.nextInt();

		System.out.println("Enter the third number");

		int c = sc.nextInt();

		if (a > b) {

			System.out.println(" a is greater");

		} else if (b > c) {

			System.out.println("b is greater");

		} else {

			System.out.println("c is greater");

		}

	}

}
