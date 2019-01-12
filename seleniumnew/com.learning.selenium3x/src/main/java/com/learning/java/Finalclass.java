package com.learning.java;

public class Finalclass {

	
	 class final2
		 {
		 int a=20;
		   void method()
		  {
		  // c=a+b;
		   System.out.println("I am in final2");
		  }
		 
		 }



		static class final1  extends final2{
		 
		 int a=30;
		 
		   void method()
		   {
		     //d =a+b+c;
		     System.out.println("I am in final1");
		   }
		 
		   void display()
		   {
		 super.method(); 
		 method();
		 System.out.println("The value of a is"+a);
		 System.out.println("The value of a is"+super.a);
		   }
		 
		 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  
		  final1 f1=new final1();  
		  //f1.method();
		  f1.display();

		 }

		}
		
	}


