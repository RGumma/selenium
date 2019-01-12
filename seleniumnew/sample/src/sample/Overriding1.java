package sample;

public class Overriding1  extends Overriding{

	
	public void Human(double a){
		
		
		System.out.println("My name is Rajani");
	}
	

	
	public static void main(String[] args){
		
		
		Overriding1 o = new Overriding1();
		
		o.Human(100);
	}
}
