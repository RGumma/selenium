package com.themisinc;

class VariableDemo {

		   int count=0;

		   public void increment()

		   {

		       count++;

		   }

		   public static void main(Practice args[])

		   {

		       VariableDemo obj1=new VariableDemo();

		       VariableDemo obj2=new VariableDemo();

		       obj1.increment();

		       obj2.increment();

		       System.out.println("Obj1: count is="+obj1.count);

		       System.out.println("Obj2: count is="+obj2.count);

		   }

	}


