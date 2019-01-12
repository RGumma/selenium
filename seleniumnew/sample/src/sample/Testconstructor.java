package sample;

public class Testconstructor {

	public Testconstructor(int a) {

		System.out.println("I am in user defined constructor");
	}

	public static void main(String[] args) {

		Testconstructor t = new Testconstructor();

		Testconstructor t1 = new Testconstructor(10);

	}

}
