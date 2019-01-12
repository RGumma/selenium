package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
  				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("http://omayo.blogspot.com/");
  		
  		JavascriptExecutor js = (JavascriptExecutor) driver; 
  		
  		js.executeScript("window.scrollBy(0,650)");
  		
  	WebElement element=	driver.findElement(By.id("tb2"));
		
		
		String text =element.getAttribute("value");
		
		System.out.println(text);
		
		

	}

}
