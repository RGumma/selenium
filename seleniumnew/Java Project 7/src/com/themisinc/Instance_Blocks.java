package com.themisinc;

public class Instance_Blocks {
	
	
	Instance_Blocks(){
		
		
		System.out.println("0-arg constructor");
	}
	
	
	Instance_Blocks( int a){
		
	System.out.println(" 1 -arg constructor");	
		
	}
	
	
	{
		
		System.out.println("Instance_blocks");
	}
	
	
	
	public static void main(String[] args) {
		
 Instance_Blocks b = new Instance_Blocks();
 
 Instance_Blocks b1 = new Instance_Blocks(10);
	
	
	}

}
