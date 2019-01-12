package com.themisinc;

public class Interfaceclass1  implements Interfacename{

	@Override
	public int sum() {
	
	
		return num+num1;
	 	
	}

	@Override
	public int multiply() {
		
		
		return num*num1;
	}
	
	
	public static void main(String args[]){
		
		Interfaceclass1 in = new Interfaceclass1();
		
		System.out.println(in.sum());
		
		System.out.println(in.multiply());
		
	}
	
	
	

}
