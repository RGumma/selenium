package sample;

public class Panda extends Bear {
	
	public static void eat(){
		
		System.out.println("panda bear is chewing");
	}
	
	public static void main(String[] args){
		
		Panda.eat();
		
		Bear b = new Panda();
		
		b.eat();
		
	}

}
