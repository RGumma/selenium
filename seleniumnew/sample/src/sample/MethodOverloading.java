package sample;

public class MethodOverloading {

	public void m1(int a){
		
		
	System.out.println("1 arg method");	
		
	}
	
	public void m2(int a, int b){
		
		
		System.out.println(" 2 arg method overloading");
	
}
	
	
	
	public static void main(String[] args){
		
		MethodOverloading m = new MethodOverloading ();
		
		m.m1(10);
		
		
	}

}
