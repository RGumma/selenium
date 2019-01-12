package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Menuitem2 {

	public static void main(String[] args) throws InterruptedException {
		
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/menu/");
		
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		
		
	  WebElement element= driver.findElement(By.xpath(".//*[@id='menu']/li[6]/ul"));
	  
	  act.moveToElement(element,159,138).perform();
	  
	  Thread.sleep(3000);
	  
	  //driver.findElement(By.xpath(".//*[@id='menu']/li[6]/ul/li/div[@id='ui-id-10']")).click();
	  
	  //Thread.sleep(3000);
	 
	  
	 // act.moveToElement(driver.findElement(By.xpath(".//*[@id='menu']/li[6]/ul/li[1]/ul"))).build().perform();
	  
	 // Thread.sleep(3000);
	  
	// WebElement element1= driver.findElement(By.id("ui-id-11"));
	 
	// element1.click();
	    
	 // String value =  element1.getText();
	  
	  //Assert.assertTrue("Alternative".equals(element1.getText()), "test is passed");
	  
	    
	    //System.out.println(value);
	  
	  
	  
	  
	
		
		
		//act.moveToElement(element,159,138).perform();
		
		
		//driver.findElement(By.id("ui-id-11")).click();
		
		//Thread.sleep(3000);
		
		
		
		
		
		
         
		
		driver.close();
		

	}

}
