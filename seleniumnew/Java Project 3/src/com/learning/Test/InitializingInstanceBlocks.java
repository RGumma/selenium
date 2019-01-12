package com.learning.Test;

public class InitializingInstanceBlocks {
	
	int eid;
	
	{
		eid =111;
		
	}
	void disp(){
		
		System.out.println(eid);
	}
	

	public static void main(String[] args) {
	
		InitializingInstanceBlocks ib = new InitializingInstanceBlocks();
		
		ib.disp();
	}

}
