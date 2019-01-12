package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.testng.DatePicker;
import com.testng.Sample;

public class Draggable  extends Sample {
	
	
//static WebDriver driver;
	 
	@BeforeClass
	public void validating()
	{
		System.out.println("I am in Draggable");
	}

	
	@Test
	public void draggable() throws InterruptedException
	{
	
		driver.findElement(By.linkText("Draggab")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		Actions action =new Actions(driver);
		 WebElement element =driver.findElement(By.id("draggable"));
		 Thread.sleep(3000);
		action.dragAndDropBy(element,150,150).build().perform();;
		//action.s
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Droppable")).click();

	}
	
	@Test
	public void sum()
	{
		
	}
	
	public void sub(){
		
	}
}
