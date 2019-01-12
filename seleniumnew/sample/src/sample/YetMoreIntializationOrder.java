package sample;

public class YetMoreIntializationOrder {

	static{
		
		
		add(2);

	}

	static void add(int num){
		
		
		System.out.println(num + " ");
	}
	
	YetMoreIntializationOrder(){
		
		
		add(5);
	}
	
	
	static {
		
	add(4);	
		
	}
	
	{
		
		add(6);
	}
	
	
	static {
		
		new YetMoreIntializationOrder();
		
	}
	
	{
		add(8);
	}
	
	public static void main(String[] args){
		
		{
			
			
		}
		
	}
	
	
}
