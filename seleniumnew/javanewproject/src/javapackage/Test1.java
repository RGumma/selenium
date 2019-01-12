package javapackage;

public class Test1 {

	public static void main(String[] args) {
		
		String str = "goog123";
		
		String num = " ";
		
		int count =0;
		
		for(int i=0; i<str.length(); i++){
		
		Character ch = str.charAt(i);
		
		if(Character.isDigit(ch)){
		   
			count = count+1;
			 
		}
		
		}

	System.out.println(count);	
	
	}
	
}
