package javapackage;

public class Averagevalueofelements {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		
		int sum=0;
		
		;
		
		System.out.println(arr.length);
		
		int number = arr.length;
		
		for(int i=0; i<arr.length; i++){
			
			sum = sum+arr[i];
			
		}
		System.out.print(sum);
			
		int avg =sum/number; 
			
			System.out.print(avg);
		
		
		
		
	}

}
