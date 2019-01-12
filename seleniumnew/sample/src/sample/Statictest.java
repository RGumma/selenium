package sample;

public class Statictest {
	
	
	private  String name = "Static class";
	
	public static void first(){
		
	}
	
	public static void second(){
		
		
	}
	
	
	public void third(){
		
		Statictest.first();
		
	System.out.println(name);	
		
	}
	
	
	public static void main(String args[]){
		
		first();
		
		second();
		
		 third();
		
		Statictest t = new Statictest();
		
		
		 
		 
		 
		 
		
	}
	
	}

