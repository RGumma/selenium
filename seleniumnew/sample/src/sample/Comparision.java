package sample;

public class Comparision {
	
	public static void main(String[] args){
		
		String s1 ="Hello";
		
		String s2 = "Hello";
		
		//System.out.println(s1.equals(s2));
		
		String s = new String("XYZ");
		
		String s3 = new String("XYZ");
		
		
		StringBuilder sb1 = new StringBuilder();
		
	  sb1.append("Ja").append("va");
	  
	  System.out.println(sb1.toString()==s1);
	  
	  System.out.println(sb1.toString().equals(s1));
		
		
		
		
		
		//System.out.println(s==s3);
		
		//System.out.println(s.equals(s3));
		
		//System.out.println(s1==s2);
		
		
		
	}

}
