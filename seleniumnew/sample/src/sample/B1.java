package sample;

public class B1 extends A1{
 
	
	public void m2(){
		
		this.m1();
		super.m1();
		
		System.out.println("I am in method of m2 ");
		
	}
	 
	public void m1(){
		
	System.out.println("I am in child classmethod2");
	
	}
	
	
	public static void main(String[] args){
		
		B1 b = new B1();
		
		b.m1();
		b.m2();
		
		
		
		
		
		
	}

}
