package com.learning.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

public class VerifyseleniumTitle {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
	
	ExtentReports reports = new ExtentReports("./reports/report.log");
	
	
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.learm-automation.com");
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Selenium"));
		
		
		
		
	}

}
