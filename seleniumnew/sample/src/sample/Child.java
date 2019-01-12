package sample;

public class Child extends Parent{

	int a =100;
	
	int b =200;
	
	
	public void add(int a, int b){
		
		System.out.println("local variables are" +(a+b) );
		
		System.out.println("instance variables" +this.a+this.b );
		
		System.out.println(" super class variables are"+super.a+super.b);
		
	}
	
	public static void main(String[] args) {
		
		new Child().add(1000, 2000);
		

	}

}
