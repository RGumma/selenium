package com.themisinc;

 interface MyInterface {
	
	void print();
	
 }
	
	
 class A6 implements MyInterface{
	
  public void print(){
	  
	  System.out.println("hello");
	  
  }
	  public static void main(String args[]){
	
    A6 obj = new A6();
    
    obj.print();
  
  
 }

 }
	  