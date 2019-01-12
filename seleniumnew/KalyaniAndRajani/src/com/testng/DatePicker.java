package com.testng;

import java.util.List;

import com.testng.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker extends Sample {	
	
@BeforeTest
	
	void open_url()
	{
		System.out.println("I am in homepage");
		driver.get("http://jqueryui.com");
	}
	
	@BeforeClass
	public void test_mrthod(){
		System.out.println("Iam going to execute Date picker functionality");
	}
	@Test
	
	public void date_picker() throws InterruptedException
	{
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(3000);;
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("datepicker")).click();
		driver.switchTo().defaultContent();
		driver.navigate().back();
			}
	
	
	@AfterClass
	
	public void testcase_complee()
	{
		System.out.println("The Date Picker testcase is completed");
	}
	
	
	
}
