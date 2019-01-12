package com.learning.java;

public class Test1 {
	
	String ename;
	
	int eid;
	
	
	public Test1(String ename1, int eid1){
	
	 this.eid = eid1;
	 this.ename = ename1;
		
	}
	
	@Override
	public String toString() {
		return "Test1 [ename=" + ename + ", eid=" + eid + "]";
	}

 public static void main(String[] args) {
		
		
	Test1 t = new Test1("Rajani", 111);
	
	System.out.println(t);
	
	}

}
