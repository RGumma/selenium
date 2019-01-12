package com.learning.Test;

public class Emp {

	Emp(){
		
		this(10);
		
		System.out.println("0 arg constructor");
	}
	
	Emp(int a){
		this(10,20);
		
		System.out.println("1 arg constructor");
	}
	
	Emp(int a,int b){
		
		System.out.println("2 arg constructor");
	}
	
	
	public static void main(String[] args) {
		
		Emp c = new Emp();
	}

}
