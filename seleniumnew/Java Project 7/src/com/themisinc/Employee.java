package com.themisinc;

public class Employee {
	
	int eid;
	
	String ename;
	
	static String comp ;
	
	public Employee(int eid1, String name, String comp1){
		
		this.eid= eid1;
		
		this.ename= name;
		
		this.comp= comp1;
		
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + " +]";
	}

	public static void main(String[] args) {
		
     Employee e = new Employee(111, "Rajani", "Tcs");
     
     Employee e1 = new Employee(222, "Rajitha" , "Tcs");
     
     Employee e2 = new Employee(333, "Ravi" , "Tcs");
     
     System.out.println(e);
     System.out.println(e1);
     
     
		
		
}

	
}