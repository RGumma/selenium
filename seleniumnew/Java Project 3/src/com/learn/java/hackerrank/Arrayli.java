package com.learn.java.hackerrank;

import java.util.ArrayList;

public class Arrayli {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<String>();
		
		al.listIterator();
		
		
		String str  = "Rajani";
			
			char ch[] = str.toCharArray();
			
			for(int i=0; i<ch.length;i++){
				
				if(ch[i]=='a'){
					
					ch[i]='x';
				}
			
				//System.out.print(ch[i]);
			}
			
			
			String str1 = new String(ch);
			
			System.out.println(str1);
		}
		
		
		
	}


