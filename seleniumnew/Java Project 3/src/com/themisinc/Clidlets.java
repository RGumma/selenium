package com.themisinc;

public class Clidlets  extends Clidders{
	
	public void flipper(){
		
		System.out.println("Flip is a clidlet");
		
		super.flipper();
		
	}

	
	public static void main(String[] srgs){
		
		Clidlets c = new Clidlets();
		  c.flipper();
		
		
	}
	
}
