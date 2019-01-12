package themisinc;

public class CountthewordsinaString {
	
	
	public int countwords(String name){
		
		int len = name.length();
		
		System.out.println(len);
		
		return len;
		
	}
	

	public static void main(String[] args) {
		
		
		CountthewordsinaString cs = new CountthewordsinaString();
		
		cs.countwords("ravi");
		
		
	}

}
