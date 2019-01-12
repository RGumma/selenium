package com.learning.appiummv;

public class Realdevice {

	public static void main(String[] args) {

		String str = "abrambabasc";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='a'||ch[i]=='c'||ch[i]=='b'){
				
				ch[i]= ' ';
			}
		}

		String s = new String(ch);

		System.out.print(s);

		String s1 = s.replaceAll("\\s", "");

		System.out.println(s1);

	}

}
