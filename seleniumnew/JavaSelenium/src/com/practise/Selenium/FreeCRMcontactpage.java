package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeCRMcontactpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
  				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("https://www.freecrm.com/index.cfm?CFID=1421449&CFTOKEN=28174784&jsessionid=9c301ac0f375d84da52c69c443b3a7d6f365");
  		
  		driver.findElement(By.name("username")).sendKeys(" rajanichandra");
    	 driver.findElement(By.name("password")).sendKeys("Z123Y321");
    	 
    	 driver.findElement(By.xpath("//input[@value='Login']")).click();
    	 
    	 Actions act = new Actions(driver);
    	 
    	 Thread.sleep(3000);
    	 
  		
  	act.moveToElement(driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[4]/a[@title='Contacts']"))).perform();
  	
  	driver.close();
  	System.exit(0);
  				
  		
  		
  		
		

	}

}
