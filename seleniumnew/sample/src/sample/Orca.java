package sample;

public class Orca extends Whale {

	public void dive() {
		System.out.println("Orca diving");
		
	}

	public static void main(String[] args){
		
		Whale w = new Orca();
		
		w.dive();
		
		
		
	}
	
	
	
	

}
