package sample;

public class Spider extends Arthropod{
	
	
	public void printName(int input){
		
		
		System.out.println("Spider");
	}

	
	public static void main(String[] args){
		
		Spider s =new Spider();
		
		s.printName(4);
		s.printName(9.0);
		
	}
	
	
}
