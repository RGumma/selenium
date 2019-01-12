package sample;

public class Order_of_Initilization {

	private String name = "Torchie";
	
	{
		
		System.out.println(name);
	

	}

	
	private static int Count =0;
	
	static{
		
		
		System.out.println(Count);
	}
	
	static{
		
		Count +=10;
		
		System.out.println(Count);
		
	}
	
	
	public Order_of_Initilization(){
		
		
		System.out.println("constructor");
		
		
}
	
	
	public static void main(String[] args){
		
		Order_of_Initilization oi = new Order_of_Initilization();
		
	}
	
}
