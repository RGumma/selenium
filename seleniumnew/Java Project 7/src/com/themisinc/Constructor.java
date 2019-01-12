package com.themisinc;

public class Constructor {
	
	void m1(){
		
		System.out.println("Method 1");
	}
	 Constructor()
	{
	 System.out.println(" 0-arg cons");
		
	}
	
	Constructor(int a){
		
		System.out.println("1- arg cons");
	}
	
		 public static void main(String[] args) {
	  
	 Constructor t = new Constructor();
	 
	 Constructor t1 = new Constructor(10);
	 
	 t.m1();
	 
}

}
