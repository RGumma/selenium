package codingbat;

public class ModThree {
	
	public boolean modThree(int[] nums) {
		  
	    int count=0;
	  
	    System.out.println(nums.length);
	    
	  for(int i=0; i<nums.length-3; i++){
	    
	     if((nums[i]%2==0)||(nums[i+1]%2==0||nums[i+2]%2==0)){
	     
	      count = count+1;
	    }
	    
	    
	  }
	  
	 return (count==3);
	}

public static void main(String[] args) {
		
		ModThree m = new ModThree();
		
		int arr[] = {2,1,3,5};
		
	    m.modThree(arr);
		

	}

}
