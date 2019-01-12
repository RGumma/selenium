package com.learning.java;

public class Xpathandcss {

	public static void main(String[] args) {
		
		int arr[] = {10, 20 ,30};
		
		int first = arr[0];
		int second = arr[0];
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]>first){
				
				//second = first;
				
				first = arr[i];
				
				}else if(arr[i]>second){
				
				second = arr[i];
			}
		}
		
		System.out.println("the value the number is " +first);
		System.out.println(" the value the number is " +second);
		/*
		System.out.println(java.util.Arrays.toString(arr));
		java.util.Arrays.sort(arr);
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println("First highest number - >"+arr[arr.length-1]);
		System.out.println("Second highest number - >"+arr[arr.length-2]);
		System.out.println("Sixth highest number - >"+arr[arr.length-6]);*/

	}

}
