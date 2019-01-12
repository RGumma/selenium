package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Mutiple_windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String Parent_id=driver.getWindowHandle();
		
		driver.findElement(By.xpath(".//a[contains(@href,'http://www.facebook.com')]")).click();
		
	 Set<String>child_id=driver.getWindowHandles();
	 
	   for(int i=0; i<)
	 
	 
	 
	 
	 
	 
		
		
		
		
		
		
	}

}
