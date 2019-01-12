package com.learn.java.hackerrank;

import java.util.Scanner;
public class Strinandprintevenodd {

public void evenorodd(String input){
 	char ch[] = input.toCharArray();
	
 	for (int i = 0; i < ch.length; i++) {
		if (i % 2 == 0 ) {
			System.out.print(ch[i]);
		}
	
	} System.out.print(" ");
		for(int i=0; i<ch.length; i++){
			if(i%2==1){
				System.out.print(ch[i]);
			}
		}
	}
public static void main(String[] args) {
		Strinandprintevenodd dc = new Strinandprintevenodd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the string");
		String str[] =new String[2];
		for(int i =0 ; i<str.length; i++){
			str[i] = sc.next();
		  dc.evenorodd(str[i]);
		}
	}
}
