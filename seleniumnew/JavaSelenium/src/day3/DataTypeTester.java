package day3;

public class DataTypeTester {

	public static void main(String[] args){
		
		String str1 = new String("Ravi");
		String str2 = new String("Ravi");
		String str3 = "Ravi";
		String str4 = "Ravi";
		
		if(str1 == str2){
			
			System.out.println("Both object references are same");
		}else{
			System.out.println("Both object references are not same");
		}
		
		if(str3 == str4){
			
			System.out.println("Both object references are same");
		}else{
			System.out.println("Both object references are not same");
		}
		
		/*if(str1.equals(str2)){
			
			System.out.println("Both object references are same");
		}else{
			System.out.println("Both object references are not same");
		}*/
	}
}
