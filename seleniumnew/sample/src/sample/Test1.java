package sample;

public class Test1 {

	Test1(){
		
	this(10);
	
	System.out.println("O- arg constructor");
		
	}
		
	Test1(int a){
	
	
	
		System.out.println("1- arg constructor");
		
	}
		
	{
		
		System.out.println("instance block");

	}

	public static void main(String[] args){
		
		new Test1();
		
	}
	
	
}
