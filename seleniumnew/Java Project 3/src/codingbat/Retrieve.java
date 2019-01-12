package codingbat;

public class Retrieve {

	public static void main(String[] args) {
		
		String str = "a1b2c3d4";
		
		String numbers = " ";
		
		for(int i =0; i<str.length(); i++){
			
			Character ch =str.charAt(i);
			
			boolean b1=Character.isDigit(ch);
			
			if(b1== true){
				
			 numbers = numbers+ch;
			}
			
		}
		
		System.out.println(numbers);
		
		
	}

}
