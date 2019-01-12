package com.learning.Test;

public class Instance_Blocks {
	
	
	Instance_Blocks(){
		
		
		System.out.println("0- arg constructor");
	
	}
	
	Instance_Blocks(int a){
		
		System.out.println("1 arg-constructor");
	}
	
	{
	System.out.println("instance- block-1");
	
	}
	{
	System.out.println("instance-block-2 ");
	}
		
		
	public static void main(String[] args){
		
		Instance_Blocks ib = new Instance_Blocks();
		
		Instance_Blocks ib1 = new Instance_Blocks(10);
		
		
		
		
	}
	
		
		
		
	}


