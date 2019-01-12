package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.xpath("));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		 Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
