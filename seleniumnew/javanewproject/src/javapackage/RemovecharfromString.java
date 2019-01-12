package javapackage;

public class RemovecharfromString {

	public static void main(String[] args) {
		
		String str = "madan";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			
			if(ch[i]=='a'){
				
				ch[i]=' ';
			}
			
		}
		
		System.out.print(ch);

	}

}
