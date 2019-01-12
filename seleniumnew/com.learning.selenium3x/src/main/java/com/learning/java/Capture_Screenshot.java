package com.learning.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Rajani");

		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sorce= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sorce, new File("./Screenshots"));
		
		Thread.sleep(3000);
		
		driver.close();
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
