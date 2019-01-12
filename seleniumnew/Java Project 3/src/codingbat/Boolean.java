package codingbat;

public class Boolean {
	
	public boolean no14(int[] nums) {
		  
		  for(int i=0; i<nums.length; i++){
		    
		    if(nums[i]==1&&nums[i]==4){
		  
		      return false;
		     
		    }
		    
		  }
		  return true;
		}

	public static void main(String[] args) {
		
		Boolean b = new Boolean();
		
		int arr[] ={2,3,4};
	   b.no14(arr);
	}

}
