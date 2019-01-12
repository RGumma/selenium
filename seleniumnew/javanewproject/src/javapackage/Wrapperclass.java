package javapackage;

public class Wrapperclass {

	public static void main(String[] args) {
		// to represent 8 primitives in the form of objects we need 8 java classes
		// 8 java classes are called wrapper classes

//data types   Wrapper class(java.lang package)    // wrapper class are immutable 
             // Constructor
//byte  Byte  byte,String 

//short  Short  short, String 
//int     Integer int, String                                object 
		                                                    
		                                                      //Number   // Boolean  //Character
		                                                         //Byte
		                                                          // Float
		                                                            //Double, Integer,Long
//long    Long    long,String
//float   Float    float, String,double
//double  Double     double, String
//char    Charater   Char
//boolean Boolean     Boolean, String
		Integer a = new Integer(100);
		
		System.out.println(a);
		
		Integer a1 = new Integer("100");
		
		System.out.println(a1);
		
		Integer a2 = new Integer("one");
		System.out.println(a2);
		
		
		// tostring // belongs to object
		  // if you want to print reference variables internally it calls tostring method
		// System.out.println(t.toString());
		//
		
		 Test  t = new Test();
		
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
