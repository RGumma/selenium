package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jqueryui {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/#scroll");
		
		WebElement element= driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		
		driver.switchTo().frame(element);
		
		WebElement el=driver.findElement(By.xpath(".//*[@id='draggable3']"));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		
		Thread.sleep(3000);

		
		

	}

}
