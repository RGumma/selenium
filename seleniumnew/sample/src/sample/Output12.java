package sample;

public class Output12 {

	public static void main(String[] args) {

		for (int row = 1; row <= 3; row++) {

			int count = 0;

			for (int col = 1; col <= 2; col++) {

				if (row * col % 2 == 0) {

					count++;
			
				}

				System.out.println(count);

			}

		}

	}

}
