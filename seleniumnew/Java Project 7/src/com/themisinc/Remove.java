package com.themisinc;

public class Remove {
	
	public static void main(String[] args){
	
	String str = new String("28/12/2013");
	String array2[]= str.split("/", 2);
    for (String temp: array2){
       System.out.println(temp);
   }
	
}
	
}
