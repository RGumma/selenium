package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pageobjectmodel.GoogleHomePage;
import com.pageobjectmodel.SeleniumHomePage;

public class TestExecution {
	
	WebDriver driver;
	
	@Test
	public void test_execution()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		GoogleHomePage google =new GoogleHomePage(driver);
		google.enterText();
		google.clickSearchButton();
		google.clicklinkSelenium();
		SeleniumHomePage home =new SeleniumHomePage(driver);
		home.click_document();
		home.click_project();
		driver.close();
		
	}
	
	

}
