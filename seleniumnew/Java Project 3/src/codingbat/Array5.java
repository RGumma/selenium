package codingbat;

public class Array5 {
	
	public boolean sum28(int[] nums) {
		  
		  int sum =0;
		 
		  for(int i=0; i<nums.length; i++){
		    
		    if(nums[i]==2){
		      
		      sum = sum+nums[i];
		      
		    }if(sum==8){
		      return true;
		    
		    }
		    
		  }
		 return true;
		}
	
	
	
	

	public static void main(String[] args) {
		
		Array5 a= new Array5();
		int arr[] = {2,3,2,2,4,2,2};
		
		a.sum28(arr);
		
		
		

	}

}
