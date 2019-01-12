package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Jquery1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
		
WebElement element2 = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(element2);
		
		WebElement element3= driver.findElement(By.id(".//*[@id='datepicker']"));
		
		           element3.click();
		           
		           
		           
		           
		           
		           
		          //String  value= element3.getText();
		           
		        //Assert.assertEquals("04/02/2017", value);
		        
		        //driver.switchTo().defaultContent();
		
		
		

	}

}
