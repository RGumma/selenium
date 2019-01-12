package sample;

public class BirdSeed {

	private int numberBags;
	
	boolean call;
	
	
	public BirdSeed(){
		
		this(2);
		call = false;
		
		System.out.println("0- arg constructor");
		
	}
	
	public BirdSeed(int numberBags){
		
	this.numberBags = numberBags;
	
	System.out.println("1- arg- constructor");
		
	}
		
	
	public static void main(String[] args){
		
		
		BirdSeed b = new BirdSeed();
		
		System.out.print(b.numberBags);

	}

}
