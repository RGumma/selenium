package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[4]/a")).click();
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	 WebElement element1= driver.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
	 
	 WebElement element2 = driver.findElement(By.xpath(".//*[@id='selectable']/li[2]"));
	 
	 WebElement element3 = driver.findElement(By.xpath(".//*[@id='selectable']/li[3]"));
	 
	 Actions act = new Actions(driver);
	 
	 act.keyDown(Keys.CONTROL).click(element1).click(element2).click(element3).build().perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
		
		
		
		
		
		
		
		

	}

}
