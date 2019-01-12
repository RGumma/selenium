package com.themisinc;

public class Emp {
	
	int eid;  // default values will be printed 
	
	String ename;
	
	float esal;
	
	public Emp(eid1, ename, ){
		
		this.eid= 
		
	}
	
	void disp(){
		
		System.out.println("emp id "  +eid );
		
		System.out.println("emp id " +ename);
		
		System.out.println("esal" +esal);
		
	}
	
	Emp(int eid, String ename, float esal){ // purpose of constructor is to initialized the instance variables during object creation 
		
		eid =111;
		ename ="ratan";
		esal = 10000.56f;

	}
	 
	public static void main(String[] args) {
		
		Emp e1 = new Emp(111, "ratan", 10000);
		e1.disp();
		
		
		
		
		
		
		
	}

}
