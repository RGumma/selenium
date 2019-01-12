package com.themisinc;

public class Encapsulation {
	
	private int eid;
	
	private String ename;     
	
	public int getEid() {   
	
		return eid;
	}
  public void setEid(int eid) {
		this.eid = eid;
	}
     public String getEname() {
		return ename;
	}
  public void setEname(String ename) {
		this.ename = ename;
	}

  public static void main(String[] args) {
	
	   Encapsulation e = new Encapsulation();
	   
	   e.setEid(10);
	   
	   System.out.println(e.getEid());
	   
	   
	   
	 
   
	
	}

}
