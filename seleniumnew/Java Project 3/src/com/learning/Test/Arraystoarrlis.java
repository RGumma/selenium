package com.learning.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraystoarrlis {

	public static void main(String[] args) {
		
		String input[] ={"rajani", "rajitha", "prabha"};
		
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		
		System.out.println(al);
		
	}
	

}
