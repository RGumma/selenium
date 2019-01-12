package themisinc;

import java.util.Scanner;

public class PostiveorNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int a = sc.nextInt();

		if (a > 0) {

			System.out.println("number is a positive number");

		} else {

			System.out.println("number is not a positive number ");

		}

	}

}
