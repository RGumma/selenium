package goose;

public class Construc {
	
	
	int value2 = getValue2();
	static{
		
		System.out.println("Inside static block 1");
	}
	//static int value1 = getValue1();
	static{
		
		System.out.println("Inside static block 2");
	}
	static int value1 = getValue1();
	public static void methodA(){
		
		System.out.println("Inside static method");
	}
	
	private int getValue2() {
		// TODO Auto-generated method stub
		System.out.println("I'm at Value2");
		return 0;
	}

	private static int getValue1() {
		// TODO Auto-generated method stub
		
		System.out.println("I'm at Value1");
		return 0;
	}

	{
		System.out.println("Inside instantiation block");
	}
	
	{
		System.out.println("Inside instantiation block2");
	}
	
	public void method(){
		
		System.out.println("Inside the method");	
	}
	
	public Construc(){
		
		System.out.println(" 0- arg constructor");
	}
	
	public Construc(int a){
		
		System.out.println(" 1 - arg constructor");
	}
	
	
	public static void main(String[] args){
	
		Construc c1 = new Construc();
		Construc c2 = new Construc();
		Construc c3 = new Construc(10);
		Construc c4 = null;
		c4.methodA();
		c4.method();
		
	}
}
