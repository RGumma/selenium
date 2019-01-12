package codingbat;

import java.util.Scanner;

public class Divisor_sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number");
		
		int n = sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<n/i && n%i==0; i++){
			
			sum = sum+n;
		  	
		}
		
		System.out.print(sum);
		
	}

}
