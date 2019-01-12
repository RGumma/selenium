package com.learning.Test1;

public class Childoverriding extends Overriding {

	public void marry(){
		
		System.out.println("marry beautiful girl");
		
}
	
	public static void main(String[] args){
		
		Overriding c = new Childoverriding();
		
		c.marry();
		
		
	}
	
	

}
