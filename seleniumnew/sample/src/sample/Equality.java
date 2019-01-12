package sample;

public class Equality {

	public static void main(String[] args) {
		
		String s1 = "Cat" ;
		
		String s2 = "Cat" ;
		
		String s3 = new String(s1);
		
	 System.out.println(s1==s2);
	 
	 
	 System.out.println(s1.equals(s2));
	 
	 System.out.println(s1==s3);
	 
	 
	 System.out.println("Cat"==(s1));
	 
		
	}

}
