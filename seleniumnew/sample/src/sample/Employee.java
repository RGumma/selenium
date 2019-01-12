package sample;

public class Employee {

	int id;
	String name;
	float salary;
	
	void emp(){
	
		System.out.println(" the id is" +id);
		
		System.out.println("the id is" +name);
		
		System.out.println("the salary is " +salary);
		
	}
	
	public Employee(){
		
		id =10;
		
		name = "rajani";
		
		salary =2000.56f;
		
	}
	
	
		public static void main(String[] args){
			
			
			Employee e = new Employee();
			
			e.emp();
			
			Employee e2 = new Employee();
			e2.emp();
			
			
			
		
		
		
	}

}
