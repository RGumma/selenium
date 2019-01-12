package com.themisinc;

import java.util.Scanner;

public class Allthenumbersareequalornot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the five digit number");
		
		   int number = sc.nextInt();
		   
		   int sum =0;
		   
		   for(int i=1; i<=5; i++){
			   
			   
			   sum = sum+i;
			   
			   double avg = (sum+i/5);
			   
			   
			  // System.out.println(sum);
			   
			   System.out.println(avg);
			   
			   
		   }
            
		//String number = sc.next();

		//char ch[] = number.toCharArray();

		//System.out.println(ch.length);

		//int sum = 0;
		//for (int i = 0; i < ch.length; i++) {

			//sum = sum+ch[i];

			//System.out.println(sum);

		//}

	
	
	}
}

