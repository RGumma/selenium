package practisejavanew;

public class Retrievewordsfromsentence {

	public static void main(String[] args) {
		
		
		String str = "google";
		
		int count=0;
		
	      char ch[] = str.toCharArray();
	      
	      for(int i=0; i<ch.length; i++){
	    	  
	    	  if(ch[i]=='o'){
	    		  
	    		  count= count+1;
	    		 
	    	  }
	    	  
	    	  if(ch[i]=='e'){
	    		  
	    		  count = count+1;
	    	  }
	    	  
	      }
	      
	    System.out.println(count);  
	}
		
		
		
		
		
		 
		
		
			
			
			
		}
		
	
		
		
		




