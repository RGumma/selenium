package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://jqueryui.com/draggable/#scroll");
		
		
		//driver.switchTo().frame("demo-frame");
		
		driver.get("http://only-testing-blog.blogspot.in/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.xpath(".//*[@id='blog-pager']/a"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		 Thread.sleep(5000);
		

	}

}
