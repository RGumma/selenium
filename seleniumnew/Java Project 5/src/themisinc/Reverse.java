package themisinc;

public class Reverse {

	public static void main(String[] args) {

		String s1 = "Rajani";

		System.out.println(s1.length());

		//System.out.println("last char" + " " + s1.charAt(s1.length() - 2));

		char[] ch = s1.toCharArray();

		for (int i = s1.length()-1; i >= 0; i--) {

			System.out.print(ch[i]);

		}

		System.out.println("\n");
		int length = s1.length();
		for(int i=1;i<= length;i++){
			
			System.out.print(ch[length-i]);
		}
	}

}
