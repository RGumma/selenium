package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Spice {
	
	public static WebDriver driver;
	
	public WebElement element;
	
	
	@BeforeTest 
	public static void setupBrowser(String browser){
		
		if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		
		}else if(browser.equals("firefox")){
				 
				driver= new FirefoxDriver() ;
			}
	}
		@Test
		public void radioButton(String locator){
		
	 	
			driver.findElement(By.id(locator)).click();
		}
		
		@Test
		public static void checkTextfield(String locator){
		
		if(driver.findElements(By.xpath(locator)).size() !=0){
		
		System.out.println("Element is present");
		
		}else{
			
			System.out.println("element not present");
		}
	
		}
		
		@Test
		
		public static void datepicker(String locator){
		
	     driver.findElement(By.xpath(locator)).click();
		
	     
		
		
		}
	
	
	
	
	
	
	

}
