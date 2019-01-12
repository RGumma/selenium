package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {


 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         
				WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("http://www.jqueryui.com/"); 
		   Thread.sleep(3000);
		  // driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		   driver.findElement(By.linkText("Selectable")).click();
		   //driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		   Thread.sleep(3000);
		   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		   
		   WebElement element1 =driver.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
		   WebElement element2 =driver.findElement(By.xpath(".//*[@id='selectable']/li[2]"));
		   WebElement element3 =driver.findElement(By.xpath(".//*[@id='selectable']/li[3]"));
		   WebElement element4 =driver.findElement(By.xpath(".//*[@id='selectable']/li[4]"));
		   Actions actions =new Actions(driver); 
		     
		   actions.keyDown(Keys.CONTROL).click(element1).click(element2)
		       .click(element3).click(element4).build().perform();
		      
		   
		   
		   Thread.sleep(3000);
		   driver.quit();
		  
		 }

		
		
		

	}

