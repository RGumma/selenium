package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet12 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
       // <input type="email" class="inputtext" name="email" id="email" tabindex="1" data-testid="royal_email">
        
        
       //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Rajani");
        
      // driver.findElement(By.cssSelector("input#email")).sendKeys("Rajitha");
       
      // driver.findElement(By.cssSelector("#email")).sendKeys("Rajitha");
       
      // driver.findElement(By.cssSelector(".email")).sendKeys("Rajani");
       
       driver.findElement(By.xpath("//input")).sendKeys("Rajani");
        
        Thread.sleep(3000);
        
        driver.close();
        
        
        
        
        
        
        
        
	}

}
