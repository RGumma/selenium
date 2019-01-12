package com.learning.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.)
		
		driver.findElement(By.id("datepicker")).click();
		
	//List <WebElement> element =	driver.findElements(	By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		
		//int count =element.size();
		
		//System.out.println(count);
		
		
		
		
		
		

	}

}
