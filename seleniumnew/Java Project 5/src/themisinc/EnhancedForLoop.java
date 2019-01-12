package themisinc;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String names[] = {"Rajani", "Ravi","vasisht", "Kota", "Gummadidala"};
		
		for(int i= 0; i<names.length; i++){
			
			System.out.println(names[i]);
			
	}
		
		for(String x : names){
			
			System.out.println(x);
			
		}
		
		

	}

}
