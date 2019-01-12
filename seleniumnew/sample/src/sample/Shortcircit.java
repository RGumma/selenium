package sample;

public class Shortcircit {

	public static void main(String[] args) {
		
		
		int x = 6;
		
		boolean y = (x>=6)||(++x<=7);
		System.out.println(y);

	}

}
