package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://echoecho.com/htmlforms11.htm");
		
		Thread.sleep(3000);
		
	Select make = new Select(driver.findElement(By.name("mydropdown")));
		
		
		//verify dropdown does not select multiple selection
	
	// Assert.assertFalse(make.isMultiple());
	 
	// Assert.assertEquals(3, make.getOptions().size());
	 
	 make.selectByVisibleText("Fresh Milk");
	 
	 //Assert.assertEquals("Fresh Milk", make.getFirstSelectedOption().getText());
		
		make.selectByIndex(2);
		
		//Assert.assertEquals("Hot Bread", make.getFirstSelectedOption().getText());
		
		
		
		driver.quit();

	}

}
