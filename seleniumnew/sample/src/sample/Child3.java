package sample;

public class Child3 extends Parent2 {

	
	Child3(){
		
	this(10);
	
System.out.println("0 arg_constructor");
		
	}
	
	Child3(int a){
	
		super();
System.out.println("1 arg_constructor");
	

	}	
	
	public static void main(String[] args){
		
		Child3 c = new Child3();
		
		
		
		
		
		
	}
	
}


