package com.learning.Test;

public class Except {

	public static void main(String[] args) {
		
		try{
			
			int a[] = new int[5];
			a[5]=30/0;
		}

		catch(ArithmeticException e){
		}System.out.println("task1 is executed");
		
	}

}
