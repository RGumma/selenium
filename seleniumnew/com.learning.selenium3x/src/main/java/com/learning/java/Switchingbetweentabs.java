package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingbetweentabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
	String Parent=	driver.getWindowHandle();
	
	System.out.println(Parent);
		
	WebElement element =driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]"));
	
	element.click();
	
	 Set<String> al =driver.getWindowHandles();
	 
	 element.click();
  
  System.out.println(al.size());
  
  for(String child: al){
	  
	if(!Parent.equals(child)){
		
		//element.click();
		
		driver.switchTo().window(child);
		
		Thread.sleep(3000);
		
		driver.close();
	}
	  
  }
  
  driver.switchTo().window(Parent);
  
 System.out.println( driver.getTitle());
  
  
  
	
	
	
		
		
		
		
		
		
		
		

	}

}
