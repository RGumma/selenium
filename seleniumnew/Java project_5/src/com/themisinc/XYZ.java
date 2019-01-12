package com.themisinc;

interface AnotherInterface{
	
	public void methodC();
}
 public class XYZ implements MyInterface,AnotherInterface {

	 
    public void method01() {
    	
    	System.out.println("implementation of method1");
		
    }

	@Override
	public void method2() {
		
		System.out.println("implementaion of method2");
		
	}


   public static void main(String arg[]){
	
	MyInterface obj = new XYZ();
	
	obj.method01();
	
}

@Override
public void methodC() {
	// TODO Auto-generated method stub
	
}
	
	}