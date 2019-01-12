package com.themisinc;

public class Test {

	Test() {

		this(10);
		System.out.println("0- arg constructor");
	}

	Test(int a) {

		this(10, 20);

		System.out.println("1- arg cons ");

	}

	Test(int a, int b) {

		System.out.println("2- arg cons");

	}

	public static void main(String[] args) {

		Test t1 = new Test();

	}

}
