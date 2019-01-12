package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://jqueryui.com/slider/");
			
			driver.switchTo().frame(0);
			
			WebElement element= driver.findElement(By.xpath(".//*[@id='slider']"));
			
			Actions act = new Actions(driver);
			
			act.clickAndHold(element).moveToElement(driver.findElement(By.xpath(".//*[@id='slider']/span"))).release(element).build().perform();
			
			Thread.sleep(3000);
			
			driver.close();
			
			
		
		
		
	}

}
