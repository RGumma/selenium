package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Linksinapage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		 List<WebElement>list= driver.findElements(By.tagName("a"));
		 
		Assert.assertEquals(47, list.size());
		
		
		for(int i=0 ; i<list.size(); i++){
		 
		
			System.out.println(list.get(i));
		 
		}
		 
		 driver.close();
		
		

	}

}
