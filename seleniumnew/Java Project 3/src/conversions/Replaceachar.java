package conversions;

public class Replaceachar {

	public static void main(String[] args) {
		
		String str = "Rajani";
		
		for(int i=0; i<str.length(); i++){
			
			char ch[] =str.toCharArray();
			
			if(ch[i]=='a'){
				
				ch[i]='x';
				
			}
			
			String str1 = new String(ch);
			
			System.out.println(str1);
			
		}


	
}
	
}
