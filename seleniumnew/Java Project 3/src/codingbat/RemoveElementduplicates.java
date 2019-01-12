package codingbat;

public class RemoveElementduplicates {

	public static void main(String[] args) {
		
		int arr[] ={1,2,2,3,1,4,3,5,6,7,2,4}; //int arr[] = {10,20,30,40};
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i]==arr[j]){
					
					shuffle(arr,j);
				}
			}
		}
		display(arr);
	}
	
	public static void display(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
	}
	public static void shuffle(int[] arr,int j){
		
		for(int i=j+1;i<arr.length;i++){
			arr[j]=arr[i];
			j=i;
		}
	}
}
