package com.themisinc;

public class Instance_variables {

	int a =20;
	
	int b=10;
	
	static int f =10;
	
	static int g=20;
	
  public void method2(){
		
		int c= 10;
		
		System.out.println("variables are" +c);
		
		System.out.println("variables are" +a);
	
	} 
	
	public static void main(String[] args) {
		
		int c =20;
		
 System.out.println("static variables" + Instance_variables.f);
	
	 Instance_variables i = new Instance_variables();
	
	System.out.println("instance variables" + i.a);
	
	System.out.println("instance variables" + i.b);
	
	 System.out.println("local variables" +  c);
	 
	  i.method1();
	  
	  System.out.println("Local variables" + i.d);
	  
	  System.out.println( "static variables" + Instance_variables.f);
	  
	  
	
	 // i.method2();
	  
	  //declared inside the class but outside of the method is called instance variables
	  
	  //scope of the variables- inside the class of the method and constructors 
	} 
	
	
	
	// Access permission 
	
	int d =10;
   
	 public void method1(){
		 
	  int a =10;
	  
	  int b=20;
    
	   System.out.println(" Local variables are" +a);
	   
	   System.out.println("Local variables are" +b);
	   
	   
	
	 }

	}

	