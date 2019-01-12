package sample;

public class Method_overriding2  extends Method_Overriding{

	
	public int sub(int a , int b){
		
		int z = a-b;
		
		System.out.println("subtracttion of two numbers" +z);
		
		return z;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Method_overriding2 mo = new Method_overriding2();
		
		mo.sub(2, 3);
		
		
		
		
		
	}

}
