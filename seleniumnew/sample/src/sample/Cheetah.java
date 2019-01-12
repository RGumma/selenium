package sample;

public class Cheetah {
	
	int numSopts;
	
	public Cheetah(int numSpots){
		
		//this.numSopts = numSpots;
		
		numSopts = numSpots;
		
	}
	
	public String toString(){
		
		
		return "numSpots";
	}

	public static void main(String[] args) {
		
		Cheetah c = new Cheetah(50);
		
		System.out.println(c);
		

	}

}
