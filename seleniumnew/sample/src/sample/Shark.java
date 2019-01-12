package sample;

public class Shark  extends Inheritedmembers{
	
	private int numberofFins = 8;
	
	public Shark(int age){
		
		super(age);
		
		this.size=4;
		
	}
	
	
	public void displaySharkDetails(){
		
		System.out.println("Shark with age: "+this.getAge());

	   System.out.println("and "+this.size+" meters long");
	   
	   System.out.println("with" +this.numberofFins+" fins");
	}

	
	public static void main(String[] args){
		
		Shark s = new Shark(30);
		
		s.displaySharkDetails();
		
		
		
	}
	
	
}
