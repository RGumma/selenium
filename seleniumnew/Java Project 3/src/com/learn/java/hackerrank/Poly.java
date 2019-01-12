package com.learn.java.hackerrank;

public class Poly {

	private int empid;
	private String empname;
	private int empsalary;
	
	public int getempid(){
		
		return empid;
	}
	
	public String empname(){
		
		return empname;
	}
	
	public int empsalary(){
		
		return empsalary;
	}
	
	public void setempid(int eid){
		
		this.empid= eid;
	}
	
	public void setempname(String name){
		
		this.empname=name;
	}
	
	public void setsalary(int salary){
		
		this.empsalary=salary;
	}
	
	
  public static void main(String[] args){
	  
	  Poly p = new Poly();
	  
	  p.setempid(101);
	  p.setempname("rajani");
	  p.setsalary(100);
	  
	  System.out.println(p.getempid());
	  System.out.println(p.empname());
	  System.out.println(p.empsalary());
	  
	  
	  
	  
  }
	
}



