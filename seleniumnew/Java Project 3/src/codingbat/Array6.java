package codingbat;

public class Array6 {
	
	public boolean modThree(int[] nums) {
		  
	    int count=0;
	  
	  for(int i=0; i<nums.length; i++){
	    
	     if(nums[i]%2==0||nums[i]%2==1){
	     
	      count = count+1;
	    }
	  }
	  
	 return (count==3);
	}


	public static void main(String[] args) {
		
		Array6 a = new Array6();
		
		int arr[] = {2,4,2,5};
		a.modThree(arr);
		

	}

}
