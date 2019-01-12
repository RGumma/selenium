package day2;

public class CalculatorTest {

	public static void main(String[] args) {
	
		CalculatorOne one = new CalculatorOne();
		CalculatorTwo two = new CalculatorTwo();
		
		System.out.println(one.sum(5,6));
		System.out.println(two.sum(5,6));
		
		Calculator calcOne = new CalculatorOne();
		Calculator calcTwo = new CalculatorTwo();

	}
}
