package com.themisinc;

public class ChildClassConstructor1 extends ParentclassConstructor1{
	
	
	ChildClassConstructor1(){
		
		super(10);
		System.out.println("Childclassconstructor");
		
	}
	
	public static void main(String[] args) {
		
       ChildClassConstructor1 c = new ChildClassConstructor1();
       
       
	}

}
