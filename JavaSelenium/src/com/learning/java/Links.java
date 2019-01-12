package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumhq.org/");
		
		int count =driver.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		
		driver.close();
		
		
		
	}

}
