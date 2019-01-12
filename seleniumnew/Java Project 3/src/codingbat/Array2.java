package codingbat;

public class Array2 {
	
	public int sum13(int[] nums) {
		  
		  int sum=0;
		  
		  for(int i=0; i<nums.length; i++){
		    
		     if(nums[i]==0){
		       
		       return 0;  
		     }else if(nums[i]==13){
		       
		      i++;
		     }else{
		       
		       sum = sum+nums[i];
		       System.out.println(sum);
		     }
		  }

		  return sum;
		}

	
	

	public static void main(String[] args) {
		
		Array2 a = new Array2();
		
		int arr[] = {1,2,3};
		a.sum13(arr);
		
		
		

	}

}
