package codingbat;

public class Array4 {
	
	public boolean no14(int[] nums) {
		  
		  boolean isOne=false;
		  boolean isFour=false;
		  for(int i=0; i<nums.length; i++){
		    
		      if(nums[i] == 1) {
		      
		      isOne=true;
		      }
		      if(nums[i] == 4){
		        
		       isFour=true;
		      }
		    } 
		  if(isOne && isFour) return false;
		  else return true;
		  
		}
	
	public static void main(String[] args) {
		
		Array4 a = new Array4();
		
		
		int arr[] = {1,2,3,4};
		a.no14(arr);
		
		
		
		

	}

}
