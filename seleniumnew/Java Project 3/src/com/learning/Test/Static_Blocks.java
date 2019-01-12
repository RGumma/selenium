package com.learning.Test;

public class Static_Blocks {
	
	
	static int eid;
	
	
	static{
		
		
		
	eid =222; 
	}

	static
	{
		
		
		System.out.println("Static-Blocks1");
	}
	
	static
	
	{
		
		
		System.out.println("Static- Block2 ");
	}
	
	
	{
		
		
		System.out.println("Instance_Block1");
	}
	
	
	{
		
		
		System.out.println("Instance_Block2");
	}
	
	Static_Blocks(){
		
		System.out.println("zero- arg -constructor");
		
		
	}
	
	
	public static void main(String[] args){
	  
	  Static_Blocks ib = new Static_Blocks();
	  
	  
	  
	  
  }

	}


