package sample;

abstract class Reptile {
	
	public void layEggs(){
		
		
		System.out.println("Reptile is laing eggs");
	}
	
	
	public static void main(String[] args){
		
		Reptile r = new Lizard();
		r.layEggs();
		
	}
	

}
