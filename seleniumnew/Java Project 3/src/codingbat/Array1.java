package codingbat;

public class Array1 {

	public int countEvens(int[] nums) {
		 int count=0;
		  
		  for(int i=0; i<nums.length; i++){
		    
		    if(nums[i]%2==0){
		      
		      count = count+1;
		     
		    }
		    
		  } 
		  return count;
		} 
	public static void main(String[] args) {

		Array1 a = new Array1();
		//int num[]= {2,1,2,3,4};
		a.countEvens(new int[]{2,2,0});
		

	}

}
