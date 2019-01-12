package themisinc;

import java.util.Scanner;

public class Swappingofnumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstnumber");

		int a = sc.nextInt();

		System.out.println("Enter the second number ");

		int b = sc.nextInt();
		
		
		System.out.println("Before swapping" + a);

		int temp = a;

		a = b;

		b = temp;

		System.out.println(" Swapping of first number" + " " + a );
		//System.out.println(" Swapping of  second " + " " + temp);

	}

}
