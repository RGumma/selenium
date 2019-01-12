package sample;

public class Order_of_Initialization {

	private String name = "Fluffy";
	
	{
		
		System.out.println("setting field");
		
	}
	
	
	public Order_of_Initialization (){
	
		
		name = "Tiny";
		
		System.out.println("setting constructor");
		
	}
		
		
	public static void main(String[] args){
		
		
		Order_of_Initialization oi = new Order_of_Initialization();
		
		System.out.println(oi.name);
		
		

	}

}
