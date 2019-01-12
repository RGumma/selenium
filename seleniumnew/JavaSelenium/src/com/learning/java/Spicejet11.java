package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Spicejet11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement element=driver.findElement(By.id("u_0_r"));
		
		Assert.assertEquals("Create Account", element.getText());
		
		
		WebElement element1 = driver.findElement(By.
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
