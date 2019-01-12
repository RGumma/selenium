package sample;

public class Loading {

	public static int a = 5;
	
public int b = 10;

	static {
      
		System.out.println("value of the static variable" + " "+ a);
		
		System.out.println("Inside the first static block");

	}

	static {

		System.out.println("Inside the second static block ");

	}
	
	
	public static int add(int x, int y){
		
		int z = x+y;
	System.out.println("value of z is" +z);	
	 
	return z;
	}
	
	
	public int sub(int x, int y){
	
	int z = x+y;
	System.out.println("value of z is" +z);
	
	
	return z;
		
	}
	

	{
       System.out.println("value of instance variable is " +b);
		System.out.println("Inside the first instance block");

	}

	{
		System.out.println("Inside the second instance block");

	}

	public Loading() {

		System.out.println("Inside the constructor");

	}

	public Loading(int a) {

		System.out.println("Inside the second constructor");

	}

	public static void main(String[] args) {
		
		Loading l = new Loading();
		Loading l1 = new Loading(10);
		
		Loading.add(20, 30);
		
		l1.sub(10, 20);
		
		
		
	
		
		
		

	}

}
