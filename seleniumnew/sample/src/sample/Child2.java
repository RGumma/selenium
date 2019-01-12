package sample;

public class Child2 extends Parent1 {

	
	public void method1(){
		
		
	System.out.println("I am in method2");	
	}

	
	
	public void method3(){
		
		
	this.method1();
	 
	super.method1();
	
		
	}
	
	
	public static void main(String[] args){
		
		Child2 c = new Child2();
		 c.method3();
		
		
		
		
	}
	
	
	
}
