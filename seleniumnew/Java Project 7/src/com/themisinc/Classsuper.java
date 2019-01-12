package com.themisinc;

public class Classsuper extends Super {
	
	int a=10;
	
	int b =20;
	
	public void m1(int a, int b){
		
		System.out.println("Local variables are" + (a+b));
		
		System.out.println("instance variables are" + (this.a +this.b));
		
		System.out.println("Parent varaibles are" + super.a +super.b);
	}
	
	public static void main(String[] args) {
		
		Classsuper cs = new Classsuper();
		
	     cs.m1(100, 200);
	     
	     
		
		
		
		
		
		
		

	}

}
