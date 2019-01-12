package sample;

public class Order {

	static String result = "";
	
	{
		
		result += "c";
		
		System.out.println(result);
	}
	
	static 
	{
		
		result += "u";
		
		System.out.println(result);
		
	}
	
	{
		
		result += "r";
		
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args){
	
	System.out.println(Order.result + " ");
	
	System.out.println(Order.result + " ");
	
	new Order();
	
	new Order();
	
	System.out.println(Order.result);
	
}

}
