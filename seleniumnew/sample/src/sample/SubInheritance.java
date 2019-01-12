package sample;

public class SubInheritance extends Inheritance {

	void m1(){
		
		super.m1();
		
		System.out.println("M1 of child class");
	
	}
	
	
	public static void main(String[] args){
		
		
		SubInheritance s = new SubInheritance();
		
		s.m1();
		
		
		
		
	

	}

}
