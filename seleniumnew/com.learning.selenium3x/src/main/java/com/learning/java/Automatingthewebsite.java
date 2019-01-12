package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automatingthewebsite {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://www.ebay.com");
	
	driver.findElement(By.id("gh-ac")).sendKeys("rajani");
	
	Actions act = new Actions(driver);
	
	WebElement element = driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a"));
	
	Thread.sleep(3000);
	
	act.moveToElement(element );
	
	
	
	

	}
}