package com.learning.java;

public class Child extends Parent {

	
	public void method(){
		
		
		System.out.println("I am in child class method");
	}
	
	public float method1(float  a , float b){
		
		float f = a+b; 
		
		System.out.println("value of a" + (a+b));
		
		return f;
	}
	
	public static void main(String[] args) {
		
        	 //Child c = new Child();
        	 
        	 Parent p = new Child();
        	
        	     p.method3();
        	    
        	       p.method1(10, 30);
        	      
        	       Child c= (Child) p; 
        	      
        	      c.method();
        	 
	}

}
