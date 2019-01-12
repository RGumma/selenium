package com.learning.java;

public class Encapsulation {
	
	private int eid;
	
	private String ename;
	
	private int age;
	
    public void setEid(int eid1){
    	
    this.eid = eid1;	
    	
    }
	
   public void setEname(String ename1){
	   
	   this.ename = ename1;
	  
   }
    
   public void SetAge(int age1){
	   
	   
	   this.age= age1;
   }
   
   public int getEid(){
	   
	   
	   return eid;
   }
   
   public String getEname(){
	   
	   
	   return ename; 
   }
   
   public int age(){
	   
	   
	   return age;
   }
    
	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		
		e.setEid(111);
		
		e.setEname("Rajani");
		
		e.SetAge(10);
		
		int value = e.getEid();
		
		System.out.println(value);
		

	}

}
