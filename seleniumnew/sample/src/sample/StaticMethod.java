package sample;

public class StaticMethod {

	
	public  static int count = 4;
	
	
	public static int addition(int x, int y, int z){
		
		z= x+y;
		
		
		return z;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(StaticMethod.count);
		
		
		
		StaticMethod sm1 = new StaticMethod();
		
		StaticMethod sm2 = new StaticMethod();
		
		StaticMethod sm3 = new StaticMethod();
		
		
		sm1.count =5;
		
		System.out.println(sm1.count);
		
		System.out.println(sm2.count);
		
		System.out.println(sm3.count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
