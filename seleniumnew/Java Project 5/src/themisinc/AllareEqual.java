package themisinc;

import java.util.Scanner;

public class AllareEqual {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int x = sc.nextInt();

		System.out.println("Enter the second number");
		
		int y = sc.nextInt();
		
		System.out.println("Enter the third number");
		
		int z = sc.nextInt();

		if (x == y||y==z||z==x) {

			System.out.println("the numbers are equal");

		} else {

			System.out.println("the numbers are not equal");

		}

	}

}
