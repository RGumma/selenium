package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.testng.DatePicker;

public class Resizable extends Sample{

	//WebDriver driver;
	
	
	@BeforeClass
	public void validation()
	{
		System.out.println("I am in a Resiable page");
		
	}
	
	@Test
	public void resizable() throws InterruptedException
	{
		driver.findElement(By.linkText("Resizable")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions action =new Actions(driver);
		 WebElement element =driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		 Thread.sleep(3000);
		action.dragAndDropBy(element,150,150).build().perform();;
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.navigate().back();
		Thread.sleep(3000);
	}
}
