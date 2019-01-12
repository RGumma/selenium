package codingbat;

public class Array3 {
	
	public int matchUp(int[] nums1, int[] nums2) {
		   int count =0;
		  for(int i=0; i<nums1.length;i++){
		    
		    if(nums1[i]!=nums2[i]){
		       
		    	count = count+1;
		    }
		   }   
		   
		  return count;
		}


	public static void main(String[] args) {
		
		Array3 a = new Array3();
		int arr1[] = {5,3};
			int arr2[] = {5,5};	
		a.matchUp(arr1, arr2);
	}
	
}
