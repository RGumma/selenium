package sample;

public class Childconstr extends Parentcons{

	public Childconstr(){
		
		this(10);
		System.out.println("chils class 0 arg constructor");
		
	}

	public Childconstr(int age){
		
		super(age);
		System.out.println("child class 1 arg constructor");
		
	}
	
	
	public static void main(String[] args){
	Childconstr c = new Childconstr();
	
	
	
	
	
	
	
}
	
}
