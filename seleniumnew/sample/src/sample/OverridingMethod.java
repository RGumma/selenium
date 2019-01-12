package sample;

public class OverridingMethod  extends ParentChild{

	void marry(){
		
		
		System.out.println("Marry red girl");

	}

	public static void main(String[] args){
		
		OverridingMethod a = new OverridingMethod();
		
		a.marry();
	}
	
}
