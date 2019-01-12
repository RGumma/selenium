package codingbat;

public class Arrayscompare {
	
	
	boolean isone = false;
	  
	  boolean isthree = false;
	  
	  public boolean lucky13(int[] nums) {
	  for(int i=0; i<nums.length; i++){
	    
	    if(nums[i]==1){
	      
	      isone = true;
	    }
	    
	    if(nums[i]==3){
	      
	      isthree = true;
	    }
	    
	  }
	  
	  if(isone || isthree){
	    
	    return false;
	  }else{
	    
	    return true;
	  }
	  
	}

	public static void main(String[] args){
		
		Arrayscompare a = new Arrayscompare();
		
		int arr[] = {1,2,3};
		a.lucky13(arr);
		
		
		
	
	
   
    
	
	
	
	

	
		

	}

}
