package sample;

public class Order1 {

	String value ="t";
	
	
	{
		
		value += "a";
		
	}
	
	
		
	{	value += "c";
		

	}
	
	public Order1(){
		
		value += "b";
	}
	
	public Order1(String s){
		
		value +=s;
	}
	
public static void main(String[] args){
	
	
	Order1 o = new Order1("f");
	
	o = new Order1();
	
	System.out.println(o.value);
	
	
	
	
}

}
