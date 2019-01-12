package com.learning.java;

public class Prime {

	int j;
	int count = 0 ;

	public void primeno(int n) {

		for (int i = 1; i <= n; i++) {

			j = n % i;

			if (j == 0) {
				
				count++;
			}

			if(count==2){
				
				System.out.println("prime no");
			}else{
				
				System.out.println("not a prime");
				
				
			}
		}
	}
	
}
