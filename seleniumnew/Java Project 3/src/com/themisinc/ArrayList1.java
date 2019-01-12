package com.themisinc;

import java.util.ArrayList;


public class ArrayList1 {
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Pen");
		
		list.add("Pencil");
		
		list.add("Box");
		
		 for(int a=0; a<=list.size(); a++){
			 
			 if(list.get(a).indexOf("P")==0){
				
			continue;
				 
				  }else{
					  
					  System.out.println(a);
				  }
			
				 
		 }
			
		 
	}
		
	}


