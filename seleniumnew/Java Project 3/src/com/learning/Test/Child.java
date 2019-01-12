package com.learning.Test;

import com.themisinc.Parent;

public class Child extends Parent{
	
	public void testit(){
		
		System.out.println("x is " +x);
		
		
	}
	
public static void main(String[] args){
		
		Child c = new Child();
		
		System.out.println(c.x);

}
	

}
