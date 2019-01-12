package sample;

public class InitializationOrder {

	private String name = "Torchie";
	
	{
		
		System.out.println(name);
}
	
	
	private static int count=0;
	
	
	static {
		
		
		System.out.println(count);
	} 
	
	
	{
		
		count++;
		
		System.out.println(count);
	}

	
	public InitializationOrder(){
		
		
		System.out.println("constructor");
	}
	
	public static void main(String[] args){
		
		
		System.out.println("read to construct");
	

	new InitializationOrder();
	
}

}