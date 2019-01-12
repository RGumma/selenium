package codingbat;

public class Findinggreaternumber {

	public static void main(String[] args) {
		
		int arr[] ={10,20,30,40};
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1 ; j<arr.length; j++){
				
				if(arr[i]>arr[j]){
					
					System.out.println(arr[i] + " is greater");
				}else{
					System.out.println(arr[j] + "is is greater");
				}
				
			}
			
		}
		
		
		

	}

}
