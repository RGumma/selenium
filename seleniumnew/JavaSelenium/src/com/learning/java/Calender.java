package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement > table =driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		 int count =table.size();
		 
		 System.out.println(count);
		 
		  for(int i=0; i<count; i++){
			  
			  String text= table.get(i).getText();
			 
			 if(text.equals("16")){
				 
WebDriverWait wait = new WebDriverWait(driver,30);
				 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")));
				table.get(i).click();
				
				String name=driver.findElement(By.id("datepicker")).getAttribute("value");
				
				Assert.assertTrue(name.equals("05/16/2018"), "Test is passed");
				 
				break;
				 
			 }
			  
		  }
   driver.close();
	
	}
	
}

