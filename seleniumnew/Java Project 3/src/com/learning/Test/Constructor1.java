package com.learning.Test;

public class Constructor1 {
	
	int eid;
	
	String ename;
	
	float sal;
	
	
	Constructor1(int eid){
		
		
		this.eid = eid;
	}
	
	
	public void m1(){
		
		System.out.println("emp id is " +eid);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Constructor1  c = new Constructor1 (111);
		
		c.m1();
		
		Constructor1  c1 = new Constructor1(222);
		
		c1.m1();
		
		
	}

}
