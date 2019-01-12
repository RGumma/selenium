package sample;

public class CustArrayList {

	public static void main(String[] args) {

		java.util.List<String> names = new java.util.ArrayList<String>();

		names.add("Lisa");

		names.add("Kevin");

		names.add("Roger");

		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);

			// int count = names.size();

			// System.out.println(count);

			if (i > 0) {
				
				System.out.println(i);

				System.out.println(", ");
			}

			System.out.println(name);

		}

	}

}
