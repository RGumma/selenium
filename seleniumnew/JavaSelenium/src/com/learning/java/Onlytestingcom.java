package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Onlytestingcom {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
           
		
		WebDriver driver = new ChromeDriver();
           
           driver.get("http://seleniumpractise.blogspot.com/");
           
          // Thread.sleep(3000);
           
           //JavascriptExecutor js =(JavascriptExecutor)driver;
   		//js.executeScript("window.scrollBy(0,450)");
          
         //  driver.findElement(By.id("username")).sendKeys("rajani");
          
          // driver.findElement(By.id("pass")).sendKeys("rajitha");
          
          driver.close();
           
           
           
           
           
           
	    
	    
		
		
		
	}

}
