package com.themisinc;

public class InstanceBlocks {
	
           

	InstanceBlocks() {

		System.out.println("0-arg constructor");

	}
	
	InstanceBlocks(int a)
	{
		System.out.println("1-arg consructor");
	}

	InstanceBlocks(int a, int b)
	
	{
		System.out.println("2-arg constructor");
	}
	
	{
		
		System.out.println("Instance Blocks");
	}
	
	public static void main(String[] args) {

		InstanceBlocks b = new InstanceBlocks();
		
		InstanceBlocks b1 = new InstanceBlocks(10);
		
		InstanceBlocks b2 = new InstanceBlocks(10,20);

	}

}
