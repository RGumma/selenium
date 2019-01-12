package sample;

public class Test {

	Test(){
	
		this(10);
	System.out.println("O org constructor");	
	}
	
	Test(int a){
	
		this(10,20);
		
	System.out.println("1- arg constructor");	
		
	}
	
	Test(int a, int b){
		
		System.out.println("2 - arg constructor");
	
	}

	public static void main(String[] args){
		
		Test t1 = new Test();
		
	}
	
}
