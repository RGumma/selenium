package codingbat;

public class Sumthearray {

	public static void main(String[] args) {
		
		String str = "Rajani";
		
		 char ch[] = str.toCharArray();
		
		 for(int i=0; i<ch.length; i++){
			 
			 if(ch[i]=='a'){
				 
				 ch[i]='x';
			 }
		
		 }
		 
		System.out.println(ch);
		
		

	}
  
	
}
