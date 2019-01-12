package sample;

public class Child1 extends Par{


	public Child1(){
		
	System.out.println("0 - arg constructor");
		
	}
	
	public Child1(int a){
		
		
		System.out.println(" 1- arg constructor");
		
	}
	
public static void main(String[] args){
	
	 Child1 c = new Child1();
	 Child1 c1 = new Child1(10);
	 
	
	
	
	
}
	

}
