package sample;

public class Counter2 {

	private  int count;
	
	public Counter2(){
	
	count++;
	
	}
	
	
	public static void main(String[] args){
		
		Counter2 c1 = new Counter2();
		
		Counter2 c2 = new Counter2();
		
		Counter2 c3 = new  Counter2();
		
		System.out.println(c1.count);
		
		System.out.println(c2.count);
		
	}
	
		
}


