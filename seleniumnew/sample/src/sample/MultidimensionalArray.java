package sample;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3}, {2,4,5}, {4,4,5}};
		
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr.length; j++){
				
				System.out.println(arr[i][j]);
				
			}
			
			
			System.out.println();
			
		}
		

	}

}
