package day2;

public class CalculatorTwo implements Calculator{

	@Override
	public int sum(int x, int y) {
	
		return x+y+2;
	}

	@Override
	public int diff(int x, int y) {
		
		return x-y+2;
	}

	@Override
	public int div(int x, int y) {
		
		return x/y+2;
	}

	@Override
	public int mul(int x, int y) {
		
		return (x*y)+2;
	}
}
