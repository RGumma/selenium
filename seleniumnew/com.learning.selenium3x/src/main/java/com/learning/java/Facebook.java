package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement element=driver.findElement(By.tagName("button"));
			
			System.out.println(element.getText());
			
			element.click();
			
			driver.close();
			
			
			
			
			
		

	}

}
