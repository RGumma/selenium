package themisinc;

public class Switch {

	public static void main(String[] args) {

		int test1 = 88;
		int test2 = 100;
		int test3 = 45;
		int test4 = 96;

		int total = test1 + test2 + test3 + test4;

		double avg = (double) total / 4;

		System.out.println(avg);

		int newAvg = (int) (avg / 10);

		switch (newAvg)

		{

		case 10:

			System.out.println("wow you got a 100%");
			break;

		case 9:

			System.out.println("Great job you got an A");
			break;

		case 8:
			System.out.println("Good job you got an B");

			break;

		case 7:
			System.out.println("your average you got a c");

		case 6:

			System.out.println("Barley passed, you got a D");
			break;

		default:
			System.out.println("you failed");

		}

	}

}
