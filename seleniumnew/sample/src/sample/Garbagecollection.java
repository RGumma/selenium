package sample;

public class Garbagecollection {
 
	
	
	public Garbagecollection(String n){
		
		name = n;
		
	}
		
		
	public static void main(String[] args){
		Garbagecollection one = new Garbagecollection("g1");
		
		Garbagecollection two = new Garbagecollection("g2");
		
		one = two;
		
		two = null;
		
		one = null;
		
	}
	
	private String name;
		
		
		
		
	}
		
	


