package sample;

public class Student12 {

	int rollno;
	
	String name;
	
	static String college = "ITS";
	
	
	static void change(){
	
		
		college ="BBDIT";
		
	}
	
	public Student12(int r, String n){
	
		this.rollno =r;
		
		this.name = n;
		
		
	}
	
	
	
	
		
 @Override
	public String toString() {
		return "Student12 [rollno=" + rollno + ", name=" + name + ",college="+college+"]";
	}

public static void main(String[] args){
	 
	 Student12 s1 = new Student12(20 , "vasisht");
	  
	 Student12 s2 = new Student12(21, "Ravi");
	 
	System.out.println(s1);
	
	System.out.println(s2);
	 
 }
 
}
	


