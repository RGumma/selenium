package sample;

public class TesttryCatch2 {

	public static void main(String[] args) {
		
		try{
			
			int num= Integer.parseInt("XYZ");
			
			System.out.println(num);
			
			}catch(NumberFormatException e){
			
			System.out.println(e);
			
			System.out.println("rest of the code");
		}

	}

}
