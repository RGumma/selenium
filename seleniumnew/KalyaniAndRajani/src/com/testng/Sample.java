package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample {

	static  WebDriver driver ;
	
	@BeforeSuite	
	void open_browser()
	{
		//this.driver = driver;
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite	
	void close_browser()
	{
		driver.quit();
	}
	
	

}
