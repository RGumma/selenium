package com.learning.java;

public class Programmer  extends Writer{
	
	public  void write(){
		
		System.out.println("writing code");
	}
	
	public static void main(String[] args){
		
		Writer w = new Programmer();
		
		w.write();
		
	}
	

}
