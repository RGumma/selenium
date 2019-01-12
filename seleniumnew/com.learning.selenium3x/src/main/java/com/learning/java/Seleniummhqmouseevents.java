package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniummhqmouseevents {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.seleniumhq.org/");
		
	//WebElement element1= driver.findElement(By.id("q"));
		
		Thread.sleep(3000);
		
		
		
		//WebElement element= driver.findElement(By.id("submit"));
	
	   Actions act = new Actions(driver);
	   
	   
	  
	   //act.moveToElement(driver.findElement(By.id("q"))).build().perform();
	   
	 //act.contextClick(driver.findElement(By.id("q"))).build().perform();
	 
	 
	 // act.sendKeys(driver.findElement(By.id("q")), "selenium").click(driver.findElement(By.id("submit"))).build().perform();
	  
	  act.keyDown(driver.findElement(By.xpath("//a[text()='Projects']")),Keys.SHIFT).click().build().perform();
	   
	// act.keyDown(Keys.SHIFT).build().perform();
	   
	   // act.keyUp(Keys.SHIFT).build().perform();
	    
	    
	   
	   //driver.findElement(By.linkText("Projects")).click();
	   
	  // Thread.sleep(4000);
	   
      

	}

}
