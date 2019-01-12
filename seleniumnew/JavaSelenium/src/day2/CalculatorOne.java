package day2;

public class CalculatorOne implements Calculator{

	@Override
	public int sum(int x, int y) {
	
		return x+y;
	}

	@Override
	public int diff(int x, int y) {
		
		return x-y;
	}

	@Override
	public int div(int x, int y) {
		
		return x/y;
	}

	@Override
	public int mul(int x, int y) {
		
		return x*y;
	}

}
