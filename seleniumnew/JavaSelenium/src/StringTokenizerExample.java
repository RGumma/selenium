import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringTokenizerExample {

	public static void main(String...args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string. Enter END to end");
		
	
		   String value1 =scan.nextLine();
			
			System.out.println(value1);
			String[] tokens = value1.split(" ");
			Map<String,Integer> map = new HashMap<String,Integer>();
			for(String token:tokens){
				
				if(map.containsKey(token)){
					int count = map.get(token);
					map.put(token,++count);
				}else{
					
					map.put(token,1);
				}
			}
			display(map);
			System.out.println("Enter string. Enter END to end");
		}
		

	
	public static void display(Map<String,Integer> map){
		
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String,Integer> entry : set){
			
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}
}
