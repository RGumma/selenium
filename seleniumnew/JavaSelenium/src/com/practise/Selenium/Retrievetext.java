package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Retrievetext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://easyautocomplete.com/");
		Thread.sleep(3000);
		String actual =driver.getTitle();
		driver.findElement(By.linkText("See more themes")).click();
		
		String expected = driver.getTitle();
		
		
		driver.close();
		
		

	}

}
