package com.themisinc;

public class Averageofarrayelements {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 6, 7 };

		int sum = 0;

		for (int i = 1; i < arr.length; i++) {

			sum = sum+arr[i];
			
			double avg =  sum/arr.length;

			System.out.println(avg);

		}

	}

}
