package sample;

public class Default_constructor {

	public void method1() {

		System.out.println("I am in the method");

	}
	
	
	public Default_constructor(){
		
	System.out.println("I am in Default constructor");	
		
	}
	
	
	public Default_constructor(int a){
		
		System.out.println("I am in user defined constructor");
		
	}
	

	public static void main(String[] args) {

		Default_constructor d = new Default_constructor();
          
		Default_constructor d1 = new Default_constructor(10);
		
		d.method1();

	}

}
