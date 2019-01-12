package com.themisinc;

public class Frog1 {
	
	int frogsize=0;
	public int getfrogsize(){
		
		return frogsize;
	}
	
	public Frog1(int s){
		
		this.frogsize =s;
	}

	
	public static void main(String[] args){
		
		
		Frog1 f =new Frog1(25);
			
				System.out.println(f.frogsize);
				
	}
}
