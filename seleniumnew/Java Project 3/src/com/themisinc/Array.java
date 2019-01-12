package com.themisinc;

public class Array {

	public static void main(String[] args) {
			
		 int[] arr1 = new int [10];
		 int j = 1;
		 for(int i=0;i<arr1.length;i++){
			 
			 arr1[i] = j;
			 j=j+2;
		 }
		 
		 for(int i= 0;i<arr1.length;i++){
			 
			 
			 System.out.println(arr1[i]); 
		 }
	}
}
