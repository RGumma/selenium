package themisinc;

import java.util.Scanner;

public class Printingstar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		  
		
		//int len= s.length();
		
		//System.out.println(len);
		

		for (int i =n; i >= 0; i--) {

			
			for(int j=0; j<i; j++){
				
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		}
		
	}


