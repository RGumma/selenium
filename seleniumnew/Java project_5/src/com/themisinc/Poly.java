package com.themisinc;


	class A1
		{
		     //Some Statements
		}
		class B1 extends A1
		{
		     //Some Statements
		}
		class C extends B1
		{
		    //Some Statements
		}
		 
		public class Poly
		{
		    public static void main(Practice[] args)
		    {
		        A1 a = new A1();  //A-Class variable refers to A-Class object
		        a = new B1();    //A-Class variable refers to B-Class object
		        a = new C();    //A-Class variable refers to C-Class object
		    }

	}


