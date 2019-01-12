package day1;

public class Calculator {

	
	public void multiply(int x, int y){
	
		System.out.println(x*y);
	}
	
	public void division(int x, int y){

		System.out.println(x/y);
	}
	
	public void sum(){
		
	}
	
	public void sum(int x, int y){
		
		System.out.println(x+y);
	}
	
	public void sum(int x, int y,int z){
		
		System.out.println(x+y);
	}
	public void sum(int x, int y,int z, int w){
	
	System.out.println(x+y);
	}
	public void sum(int x, int y,int z, int w, int t){
	
	System.out.println(x+y);
	}
	public void subtract(int x, int y){
		
		System.out.println(x-y);
	}

	public void modulus(int x, int y){
		
		System.out.println(x%y);
	}
	
	public static void main(String...args){
		
		Calculator c = new Calculator();
		c.sum(1,2);
		c.multiply(1,3);
		c.division(1,5);
		c.modulus(5,6);
		c.subtract(4,9);
	}
}
