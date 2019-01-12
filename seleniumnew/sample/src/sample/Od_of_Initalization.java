package sample;

public class Od_of_Initalization {

	private String name = "Fluffy";
	
	{
		
		System.out.println("Setting field");
		

	}

	public Od_of_Initalization(){
		
		
		name = "Tiny";
		
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args){
		
		Od_of_Initalization o = new Od_of_Initalization();
		System.out.println(o.name);
		
		
		
	}
}
