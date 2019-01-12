package sample;

public class Booleankeepgoing {

	public static void main(String[] args) {

		boolean KeepGoing = true;

		int result = 15, i = 10;

		do {

			i--;

			if (i == 8){

				KeepGoing = false;
			}
			result -= 2;

		} while (KeepGoing);

		System.out.println(result);

	}

}
