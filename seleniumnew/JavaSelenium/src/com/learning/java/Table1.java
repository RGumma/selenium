package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table1 {

	
	public static void main(String[]args) throws InterruptedException{
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/datepicker/");
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.id("datepicker")).click();
	
	List<WebElement> tablerows= driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr"));
	
	
	Actions builder = new Actions(driver);
	
	builder.click(tablerows.get(1))
			.keyDown(Keys.CONTROL)
			.click(tablerows.get(3))
			.keyUp(Keys.CONTROL)
			.build().perform();
	

Thread.sleep(3000);
	

driver.close();	
	
	
	
	
	
	
	

	}

}
