package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverlogin {

	
	public static void main(String[] args) throws InterruptedException{
	
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("Email")).sendKeys("rajitha.kota2007");
			driver.findElement(By.id("next")).click();
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			driver.findElement(By.id("Passwd")).sendKeys("rajani_12");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.id("signIn"));
			System.out.println(driver.getCurrentUrl());
			Point location = element.getLocation();
			System.out.println(location.x+","+location.y);
			element.click();
			System.out.println(driver.getCurrentUrl());
			driver.close();

}

}
