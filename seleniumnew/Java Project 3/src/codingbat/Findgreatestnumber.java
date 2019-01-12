package codingbat;

import java.util.Scanner;

public class Findgreatestnumber {

	public static void main(String[] args) {
		
		
		int a =10;
		
		int b=20;
		int c =30;
		
		int max=a;
		if(b>a){
			max=b;
			System.out.println(b);
		}
		
		if(c > max){
			
			max=c;
			
			System.out.println(c);
		}
	}
}
