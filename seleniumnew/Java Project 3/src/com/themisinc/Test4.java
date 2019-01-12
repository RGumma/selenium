package com.themisinc;

public class Test4 {

	public static void main(String[] args) {
		
		
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		
		if(!t1.equals(t2)){
			
			System.out.println("They are not equal");
			
			if(t1 instanceof Object){
				System.out.println(" t1 is an object");
				
			}
		}
		
		
	}

}
