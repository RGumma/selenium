package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.jqueryui.com/");
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Draggable')]"));
	   
	  String actual = driver.getTitle();
	   
	  // WebElement element = driver.findElement(By.className("demo-frame"));
	  
	   driver.switchTo().frame(0);
	   
	   Thread.sleep(3000);
	   
	   
	   Actions act = new Actions(driver);
	   
	   WebElement source = driver.findElement(By.id("draggable"));
	   
	   act.dragAndDropBy(source, 150, 150).build().perform();
	   
	   driver.switchTo().defaultContent();
	   
	   Assert.assertEquals(actual, "jquery.com/draggable");
	   
	   
	   
	   
	   
	   
	   
	   

	}

}
