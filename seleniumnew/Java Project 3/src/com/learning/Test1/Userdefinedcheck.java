package com.learning.Test1;

import java.util.Scanner;

public class Userdefinedcheck {
	
	public void status(int age) throws InvalidAgeException{
		
		if(age >20){
			
			System.out.println("Eligible for marraige");
		}
	
	else{
		
		throw new InvalidAgeException();
	}
	

	}
	
	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		Userdefinedcheck u = new Userdefinedcheck ();
		
		u.status(age);
		
		
		
		
		
		
		
		
		
		

	}

}
