package com.themisinc;

public class JavaVariables {

	int x = 10;

	int y = 20;

	public void method1() {

		int c = 20;

		int d = 10;

		System.out.println("Local variable is " + c);

	}

	public void method2() {
		// scope of the variables lies inside the method

		//
		int e = 20;

		System.out.println("value is" + e); // not possible

	}

	public static void main(String[] args) { // main method

		int a = 10;
		int b = 20;

		System.out.println("Local variables" + a + b);

		JavaVariables j = new JavaVariables();

		System.out.println(j.x);

	}

}
