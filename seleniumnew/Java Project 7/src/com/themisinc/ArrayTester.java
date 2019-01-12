package com.themisinc;

public class ArrayTester {

	public static void main(String[] args){
		
		
		Address[] addresses = new Address[5];
		Address addri1 = new Address();
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = a;
		
		//System.out.println(a[4]);
		//b[4] = 15;
		//System.out.println(a[4]);
		int[] c= new int[10];
		
		System.out.println(a[3]);
		b[3] = 25;
		System.out.println(a[3]);
		System.arraycopy(a, 0, c, 0, 9);
		c[3] = 35;
		System.out.println(a[3]);
		//printArray(c);
		
	}
	
	public static void printArray(int[] intarray){
		
		for(int i = 0;i<intarray.length;i++){
			
			System.out.println(intarray[i]);
		}
	}
	
	public static void printArray1(int[] intarray){
		
		for(int i : intarray){
			
			System.out.println(i);
		}
	}
}

