package com.learning.Test1;

public class Problem1 {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if(bOk){
		    if(b<=a&&c>b){
		      return true;
		    }else{
		      return false;
		    }
		  }else{
		    if(b>=a&&c>=b){
		      return true;
		    }else{
		      return false;
		    }
		  }
	}

	public static void main (String[] args){
    
		Problem1 p = new Problem1();
		p.inOrder(4, 2, 2, true);
	
	
	
	
	
	}
	
	
	
	}
