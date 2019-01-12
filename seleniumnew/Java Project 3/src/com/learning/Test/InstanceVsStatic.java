package com.learning.Test;

public class InstanceVsStatic {
	
	int a =10;
	
	static int b =20;
			
			

	public static void main(String[] args) {
		
		InstanceVsStatic is = new InstanceVsStatic();
		
		System.out.println(is.a);
		
		System.out.println(is.b);
		
		is.a =30;
		
		is.b =888;
		
		InstanceVsStatic is1 = new InstanceVsStatic();
		
		System.out.println(is1.a);
		
		System.out.println(is1.b);
		
		
		
		
		
		
		
		
		

	}

}
