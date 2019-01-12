package sample;

public class C1 extends P1 {

	public C1(){
	
		this(10);
		
	System.out.println("I am in child class  0- arg constructor");	
		
	}
	
	public C1(int a){
		
	System.out.println("I am in child class 1- arg constructor ");	
		
	}

	public static void main(String[] args){
		
		C1 c = new C1();
		
		
	}


}