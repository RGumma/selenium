package sample;

public class Eagle  extends Bird{

	public int eat(int food){
		
		
		System.out.println("Bird is eating at "+food+" units of food");
		
		return food;
	}
	
	public static void main(String[] args){
	
	Eagle e = new Eagle();
	
	e.eat(20);
	

	

}
	
}
