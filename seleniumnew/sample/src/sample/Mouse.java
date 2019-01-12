package sample;

public class Mouse {
	
	public static void main(String[] args){
	
	static int  max_length =5;
	
	int length;
	
	public void grow(int inches){
		
		if (length <max_length){
			
			
			int newsize = length +inches;
			length= newsize;
		
			}
		
		System.out.println(length);
		
		
	}
	
  
}

}