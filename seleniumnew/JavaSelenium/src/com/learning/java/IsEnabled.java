package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		WebElement element=driver.findElement(By.xpath("//input[@value='Milk']"));
		
		Boolean b=element.isEnabled();
		
		 Boolean b1 = element.isSelected();
		 
		Boolean b2= element.isDisplayed();
		
		System.out.println(b2);
			
			if(b.equals(true)){
				
				System.out.println("element is enabled");
				
			  if(b.equals(false)){
				  
				  System.out.println("element is not enabled");
			  }
			
			  if(!element.isSelected())
				  
				  element.click();
		
			}
		
		
		
		
		

	}

}
