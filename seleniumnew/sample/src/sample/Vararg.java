package sample;

public class Vararg {

	public static void sum(int... nums) {

		System.out.println(nums.length);

		int total = 0;

		for (int i = 0; i < nums.length; i++) {

			System.out.println(nums[i]);
 
			total = total + nums[i];

		}

	}

	public static void main(String[] args) {

		sum(10, 20);
		sum(10, 20, 30);

	}

}
