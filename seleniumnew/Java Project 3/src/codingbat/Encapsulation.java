package codingbat;

public class Encapsulation {
	
	private int empid;
	private String empname;
	private int empsalary;
	
	public int getempid(){
		
		
		return empid;
	}
	
	public String getempname(){
		
		return empname;
	}
	
	public int empsalary(){
		
		
		return empsalary;
	}
	
	public void setempid(int epid){
		
		this.empid= epid;
	}
	
	public void setempname(String ename){
		
		
		this.empname=ename;
	}
	
	public void setempsalary(int epsalary){
		
		
		this.empsalary= epsalary;
	}

	public static void main(String[] args) {
		
		
		Encapsulation e = new Encapsulation();
		
		e.setempid(10);
		e.setempname("rajani");
	    e.setempsalary(1000);
	    
	    System.out.println(e.empid);
	    System.out.println(e.empsalary);
	    System.out.println(e.empname);
		
		
		

	}

}
