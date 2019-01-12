package sample;

public class Test2 {

	
	{
		
	System.out.println("instance block");	
		
}
	
	
	{
		
	System.out.println("instance- blcok");	
		
	}
	

	static{
	System.out.println("static blcok");	
		
		
	}
	
	Test2(){
		
	System.out.println("O- arg constructor");
		
	}
	
	
	Test2(int a){
		
	System.out.println("1 - arg constructor");	
		
	}
		
	public static void main(String[] args){
		
		new Test();
		
		new Test(10);
		
	}

}
