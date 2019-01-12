package com.themisinc;



	
		
	class A
		{
		    int i = 10;
		}
		 
		class B extends A
		{
		    int i = 20;
		}
		 
		public class Inheritanc
		{
		    public static void main(Practice[] args)
		    {
		        A a = new B();
		 
		        System.out.println(a.i);
		    }
		
	}


