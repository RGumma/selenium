package sample;

public class MycomplexArray {

	public static void main(String[] args) {

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		
		System.out.println(myComplexArray.length);

		Outer_loop: for (int i=0; i< myComplexArray.length ;i++)

			Inner_loop: for (int j = 0; j < myComplexArray.length; j++) {

				System.out.println(myComplexArray[i][j]);

			}
		}

	}


