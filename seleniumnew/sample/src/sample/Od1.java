package sample;

public class Od1 {

	static String result = "";
	
	{
		
		result +="c";
		
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
		
		System.out.println(Od1.result);
		
		System.out.println(Od1.result);
		
		Od1 O1 =new Od1();
		
		Od1 O2 =new Od1();
		
		System.out.println(Od1.result);
		
	}
	
	

}
