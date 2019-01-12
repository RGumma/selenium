package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlGroup1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
     driver.get("https://jqueryui.com/controlgroup/");
		driver.switchTo().frame(0);
		//System.out.println(driver.findElement(By.id("car-type-button")).getText());
		driver.findElement(By.id("car-type-button")).click();
		
		Actions act = new Actions(driver);
		
		List<WebElement> dropdownlist = driver.findElements(By.xpath(".//*[@id='car-type-menu']/li"));
		int acount = dropdownlist.size();
		
			 
		java.util.Iterator<WebElement> i = dropdownlist.iterator();
		
		while(i.hasNext()){
			
			WebElement row=i.next();
			
			System.out.println(row.getText());
		}
		
		
		
		//System.out.println(driver.findElement(By.id("car-type-button")).getText());
		
		
		/*WebElement element=driver.findElement(By.xpath("//ul[@id='car-type-menu']/li[4]"));
		
		Actions act1 = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		
		Thread.sleep(3000);*/
		
		driver.close();
		
		
		
		
		
		
		
		  
		
		
		
		
		
		

	}

}
