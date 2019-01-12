package com.learning.Test1;

import java.util.Scanner;

/**
 * This program is dealing
 * @author RaviCKota
 *
 */
public class Ifels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if (n >= 1 && n <= 100) {

			if (n % 2 == 1) {

				System.out.println("weird");
			} else {
				if(n >=2 && n<=5){
					
				}else if(){
					
				}else
				else if (n >= 2 && n <= 5) {
			}

				System.out.println("wiered");
			} else if ((n % 2 == 0) && (n >= 6 && n <= 20)) {

				System.out.println("wiered");
			} else if ((n % 2 == 0) && n > 20) {

				System.out.println("not wiered");
			}
		}else {

			System.out.println("number not in range");
		}	
	}
}