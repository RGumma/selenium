package com.learning.Test;

public class Private_Childoverriding extends Private_parentovererinding{
	
	private void m1(){
		
		System.out.println("Child m1 method");
	}
	
public static void main(String[] args) {
	
	Private_parentovererinding p = new Private_Childoverriding(); 
	
	p.m1();
	
}

}
