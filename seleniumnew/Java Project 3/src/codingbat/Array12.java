package codingbat;

public class Array12 {
	
	
	public boolean has12(int[] nums) {
		  
		   boolean result = false;
		  for(int i=0; i<nums.length; i++){
		    
		    if(nums[i]== 1){
		      
		      result = true;
		    }
		    
		    if(nums[i]==2){
		    	
		    	result =true;
		    }
		  }
		  
		  return result;
		}

	public static void main(String[] args) {
		
		Array12 a = new Array12();
		int arr[] = {1,3,2};
		
		a.has12(arr);
		

	}

}
