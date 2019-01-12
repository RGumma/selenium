package com.themisinc;

public class CheckedExceptions {

	public static void main(String[] args) {
		
		int num [] = {4,5,3,4,6,5};
		
		try{
			
			System.out.println(num[num.length]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.err.println("Array Index out of bounds at index:" +e.getMessage());
			
			
		}
		
		

	}

}
