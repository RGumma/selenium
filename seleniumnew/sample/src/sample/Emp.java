package sample;

public class Emp  extends Person{

	float salary;
	
	Emp(int id, String name, float salary){
		
		super(id, name);
		
		this.salary= salary;
		
	}
	
	
	void display(){
	
		System.out.println(id +" "+name+ " "+salary);
		
	}
	
	public static void main(String[] args){
	
	Emp e = new Emp(11, "rajani",1500f);
	
	e.display();

}
}
