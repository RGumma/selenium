package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/");
		
		driver.findElement(By.xpath(".//*[@id='menu-item-140']/a")).click();
		
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable'][@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(source, 219, 150).perform();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
