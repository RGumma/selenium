package sample;

public class MOL {

	
	public void fly(double a){
		
		System.out.println("2 args overloading");
	}
	

	public void fly(int a){
		
		System.out.println("1 arg overloading");
		
		
	}
	
	
	public static void main(String[] args){
		
		
		MOL o = new MOL();
		
		o.fly(2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
