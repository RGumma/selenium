package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateHandler {

	public String showDuplicates(String value){
		
		StringBuilder sb = new StringBuilder();
		char[] chars = value.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : chars){
			
			if(map.containsKey(ch)){
				
				map.put(ch, map.get(ch)+1);
			}else{
				
				map.put(ch, 1);
			}
		}
		Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			
			Entry<Character, Integer> entry = iterator.next();
			if(entry.getValue() > 1){
				
				sb.append(entry.getKey())
				  .append(",");
			}
		}
		/*System.out.println(chars);
		Arrays.sort(chars);
		System.out.println(chars);
		char temp = chars[0];
		for(int i=1 ; i< chars.length;i++){
			
			if(temp==chars[i]){
				
				return chars[i]+"";
			}else{
				
				temp=chars[i];
			}
		}
		return null;*/
		return sb.toString();
	}
	
	public static void main(String...args){
		
		DuplicateHandler handler = new DuplicateHandler();
		System.out.print("Enter Value :");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			
			System.out.print("Enter Value :");
			String token = scanner.next();
			System.out.print(handler.showDuplicates(token));
		}
	}
}
