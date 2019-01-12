package com.learning.Test;

public class Stringmethods {
	
	public static void main(String[] args){
	
	String s1 = "rajani";
	
	String s2 = "vasisht";
	
	
	
	String s3 = "rajani";
	
	char value = 'a';
	
	System.out.println(s1.equals(s3));
	
	System.out.println(s1==s3);
	
	StringBuffer sb = new StringBuffer("Rajani");
	
	StringBuffer sb1 = new StringBuffer("Rajani");
	
	System.out.println();
	
	
	
	
	//String s4 = String.valueOf(value);
	
	String s5 = String.valueOf(value);
	
	System.out.println(s5+"nu");
	
	//System.out.println(s4+10);
	
	//System.out.println(s4);
	
	System.out.println(s1.equals(s3));
	
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.compareTo(s3));
	
	System.out.println(s1.compareTo(s2));
	
	System.out.println(s2.compareTo(s1));
	
	System.out.println(s1.charAt(1));
	
	System.out.println(s1.length());
	
	System.out.println(s1.substring(1, 3));
	
	System.out.println(s1.contains("is"));
	
	System.out.println(s1.endsWith("d"));
	
	System.out.println(s1.indexOf("is")); 
	
	//System.out.println(s1.valueOf(c)); // method converts different types of values to string.
	 //charater to string , float to string, double to string
	
	System.out.println(s1.replace('a', 'e'));
	
	System.out.println(s1.replaceAll("is", "was"));
	
	String sr = "Thank 123 you 124 for using 1243 this 34563 string 5455";
	
	String newsr = sr.replaceAll("[0-9]", " ");
	
	System.out.println(newsr);
	System.out.println(newsr.replaceAll("[a-zA-Z]", "java"));
	
	String st = "hello";
	
	char[] ch = st.toCharArray();
	
	System.out.println(ch);
	
	// string to a new char array
	
	for(int i=0; i< ch.length; i++ ){
		
		System.out.println(ch[i]);
	}
	
	
	String st1 = "Rajani";
	
	  byte b[]=  st1.getBytes(); //String to sequence of bytes
	  
	  for(int i=0; i<b.length; i++){
		  
		  
		  System.out.println(b[i]);
	  }
	  
	  
	  String su = "Rajani is a good girl";
	  
	  char [] ch1 = new char[2];
	  
	  su.getChars(7, 9, ch1,0);  // Copies characters from this string into the destination character array.
	  
	  System.out.println(ch1);
	  
	  StringBuffer sb = new StringBuffer("Hello");
	  
	  sb.append("rajani");
	  
	  System.out.println(sb);
	  
	  sb.insert(1, "Java");
	  
	  System.out.println(sb);
	  
	  System.out.println(sb.replace(1, 3, "vasisht"));
	  
	  
	  
	  
	  
	  
	
	
	
}

}