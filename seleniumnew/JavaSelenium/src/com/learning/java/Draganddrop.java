package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.jqueryui.com/");
		
	     driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
		
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
       
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target);
		
		driver.switchTo().defaultContent();
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
