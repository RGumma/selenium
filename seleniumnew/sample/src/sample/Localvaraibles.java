package sample;

public class Localvaraibles {
	
	static int a =10;
	public void m1(){
		
		int b =20;
		
		System.out.println(Localvaraibles.a);
		
	}
	
	
	public void m2(){
		
		System.out.println(Localvaraibles.a);
		
	}
	
	
	public static void main(String[] args){
		
		new Localvaraibles().m1();
		
		new Localvaraibles().m2();

		
		
		
		
		
		
		
	
	}
	
	
}
	
	
