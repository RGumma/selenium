package com.learn.java.hackerrank;

import java.util.Scanner;

public class Printresult {
	
	public void solve(double meal_cost, int tip_percent, int tax_percent){
		
		int cost =(int)Math.round(((meal_cost)+(meal_cost*tip_percent/100)+(meal_cost*tax_percent/100)));
		
		System.out.println(cost);
		
	}

	public static void main(String[] args) {
		
		Printresult t = new Printresult();
		t.solve(12.00, 20, 8);
		
		
		

	}

}
