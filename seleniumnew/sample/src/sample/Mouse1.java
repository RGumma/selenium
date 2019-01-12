package sample;

public class Mouse1 {

	public int weight;
	 
	public  int numTeeth;
	 
	 public int numWhiskers;
	 
	 
	 public Mouse1(int weight){
		 
		this(weight, 16); 
		 
	 }

	public Mouse1(int weight, int numTeeth){
		
		this(weight,numTeeth,6);
		
	}

	
	public Mouse1(int weight, int numTeeth, int numWhiskers){
	
		this.weight = weight;
		
		this.numTeeth= numTeeth;
		
		this.numWhiskers =numWhiskers;
		}
	
	public void print(){
		
		
		System.out.println(weight + " " +numTeeth+ " "+numWhiskers);
		
		
	}
	
	public static void main(String[] args){
		
		
		Mouse1 m1 = new Mouse1(15);
		
		m1.print();
		
		
		
	}	
		
	}
	
