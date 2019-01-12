package com.learning.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
            WebDriver driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("http://flipkart.com");
	
	WebElement electronics =driver.findElement(By.linkText("Electronics"));
 
	Actions action = new Actions(driver);
 
 action.moveToElement(electronics).build().perform();
 
 driver.findElement(By.xpath(".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[2]/a")).click();
 
 driver.close();



}

}