package sample;

public class Lemur  extends Primate implements HasTail{

	
	public boolean isTailStriped() {
		
		return false;
	}
	
	public int age =10;
	
	public static void main(String[] args){
		
		Lemur lemur = new Lemur();
		
		System.out.println(lemur.age);
		
		HasTail ht = new Lemur();
		
		System.out.println(ht.isTailStriped());
		
		
		Primate p = new Lemur();
		
		System.out.println(p.hasHair());
		
		
	}

}
