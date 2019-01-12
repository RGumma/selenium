package com.learning.java;

public class SecondlargestElement {

	public static void main(String[] args) {
		
		int arr[] = {4,5,6};
		
		int value = arr[0];
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]<value){
				
				value = arr[i];
			}
		}
		
		System.out.println(value);
		
		

	}

}
