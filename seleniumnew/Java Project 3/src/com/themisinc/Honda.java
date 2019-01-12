package com.themisinc;

 class Honda extends Abstract{
	
	 void run(){
	 
	  System.out.println("running safely");
		 
	 }

	public static void main(String[] args) {
		
		Abstract a = new Honda();
		
		a.run();
		

	}

}
