package javapackage;

public class Programforprime {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int sum;
		System.out.print(x+ " "+y);
		for(int i=1;i<=8;i++){
		sum= x+y;
	    System.out.print(" "+sum);
	     x=y;
	     y=sum;
	    }
		
	   }
	
    }
