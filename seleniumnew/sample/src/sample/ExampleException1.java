package sample;

public class ExampleException1 {
	
	public static void main(String[] args){
		
		try{
			
			int a=30, b=0;
			
			int output = a/b;
			
			System.out.println("Result: " +output);
		
		}catch(ArithmeticException e){
			
			System.out.println("You should not divide a number by zero");
		}
	}

}
