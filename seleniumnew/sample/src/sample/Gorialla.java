package sample;

public class Gorialla extends Anima{

	public Gorialla(int age){
		
		super(age, "Gorilla");
	
	}
	
	
	public Gorialla(){
		
		super(5);
	}

	public static void main(String[] args){
		
		Gorialla g = new Gorialla();
		
		Gorialla g1 = new Gorialla(5);
		
		
	}
	
	
}
