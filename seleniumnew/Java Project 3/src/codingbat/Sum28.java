package codingbat;

public class Sum28 {
	public boolean sum28(int[] nums) {
		    
		 int sum = 0;
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] == 2){
				sum = sum+nums[i];
				
				}
			}
			return (sum == 8);
		}
	public static void main(String[] args) {
		
		Sum28 s= new Sum28();
		
		int arr[] = {2,3,2,2,4,2,2};
		s.sum28(arr);
		
	}

}
