package sample;

public class Lion2 extends Animal2 {
	
	private void roar(){
		
		System.out.println("The "+getAge()+" year old lion says: Raor!");
		
	}
   
	public static void main(String[] args){
		
		Lion2 l = new Lion2();
		
		l.roar();
		
		
		
	}
	
}
