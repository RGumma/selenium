package com.themisinc;

public class Constructor3 {
	
  int size;
  
  String name;
  
  Constructor3(String name, int size){
	  
	 this.name = name;
	 
	 this.size = size;
	  
  }
  
  
  void display(){
	  
	  
	  System.out.println( name + " and" + size );
 }
  
  
  
  
  public static void main(String[] args){
	  
	  Constructor3 c = new Constructor3("Rajani", 36);
	  
	  
	  
	  
	  
	  
	  
  }

}
