package practisejavanew;

public class RemoveacharfromString {

	public static void main(String[] args) {
		
		String sr = "1n346h";
		String  numbers = " ";
		for(int i=0 ; i<sr.length();i++){
		
			Character ch = sr.charAt(i);
			
			if(ch.isDigit(i)){
			
				numbers =ch+numbers;
			}
		}
		System.out.println(numbers);
	}
}
