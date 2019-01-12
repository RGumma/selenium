package codingbat;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args){
		
		int[] arr = {1,2,2,3,1,4,3,5,6,7,2,4} ; //1,2,3,4,5,6,7
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			s.add(arr[i]);
		}
		System.out.println(s);
		
		
	}
}
