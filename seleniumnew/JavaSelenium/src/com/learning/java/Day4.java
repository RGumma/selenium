package com.learning.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.expedia.com/");
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.expedia.com/"), "test case is passed");
			
			//System.out.println("test case is passed");
		//}	
		//}else{
			
		//	System.out.println("test case is failed");
			
	//	}

		driver.close();
}
	
}
