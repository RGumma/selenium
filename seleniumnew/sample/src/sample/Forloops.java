package sample;

public class Forloops {

	public static void main(String[] args) {

		int count = 0;

		for (int row = 1; row <= 3; row++) {

			for (int col = 1; col <= 2; col++) {

				if (row * col % 2 == 0) {

					count++;
				}

			}
		}

	}

}
