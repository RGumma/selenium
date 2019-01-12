package com.learning.Test;

public class Stringmethods1 {

	public static void main(String[] args) {

		String name = "rajani";

		System.out.println(name.substring(2));
		
		System.out.println(name.substring(1, 4)); // returns a new string that is substring of this string
		
		System.out.println(name.replace('a', 'e'));
		
		
		char ch[] = name.toCharArray();

		for (int i = 0; i < ch.length; i++) { // string to char array

			System.out.println(ch[i]);

		}

		char c = name.charAt(1); // return the character at specified index.

		System.out.println(c);

		String s1 = "rajini";

		String s2 = "rajatha";

		// System.out.println(s1.compareTo(s2));

		System.out.println(s1.compareTo(s2)); // if s1 is greater it returns
												// positive.

		System.out.println(s1.compareTo(s2));// if s2 is greater it returns
												// negative.

		String name1 = "what do you know about me";

		System.out.println(name1.contains("what do you know"));

		System.out.println(name1.endsWith("what do you know"));

		String s3 = "javatpoint";

		String s4 = "javatpoint";

		System.out.println(s3.equals(s4));

		String name2 = "sonoo";

		String sf2 = String.format("value is %f", 32.33434); // returns a
																// formatted
																// string using
																// the specified
																// format string

		String sf1 = String.format("name2 is %s", name2);

		System.out.println(sf1);

		System.out.println(sf2);

		String s5 = "rajani";

		byte[] barr = s5.getBytes(); // encodes the string into sequence of
										// bytes

		for (int i = 0; i < barr.length; i++) {

			System.out.println(barr[i]);
		}

		String s = new String("hello javatpoint how r u");

		char[] cha = new char[3];

		s.getChars(17, 20, ch, 0);

		System.out.println(cha);

		// copies characters from the string into destination character array

	}

}
