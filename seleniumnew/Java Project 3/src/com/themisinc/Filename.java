package com.themisinc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filename {

	public static void main(String[] args) {
		
		String fileName = "driver.txt";
		
		File file = new File(fileName);
		try {
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
