package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement element= driver.findElement(By.xpath("//input[@value='female']"));
		
		Boolean b= element.isSelected();
		 
		 if(b.equals(false)){
			 
		   element.click();
			   
	      }
		
		Assert.assertTrue(element.isSelected());
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
