package javapackage;

import java.util.Scanner;

public class Test {
	
	public void age(int age) throws InvalidAgeException{
		
		if(age>20){
			
			System.out.println("eligible for marriage");
			
		}else{
			
			throw new InvalidAgeException("not eligible for marraige");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		Test t = new Test();
		t.age(18);
		
		

	}

}
