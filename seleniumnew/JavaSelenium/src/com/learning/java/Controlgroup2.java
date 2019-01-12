package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Controlgroup2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/controlgroup/");

		
		driver.switchTo().frame(0);

		driver.findElement(By.id("car-type-button")).click();

		List<WebElement> dropdownlist = driver.findElements(By.xpath(".//*[@id='car-type-menu']/li"));

		 int x= driver.findElement(By.id("ui-id-4")).getLocation().getX();
		  
		 int y = driver.findElement(By.id("ui-id-4")).getLocation().getY();
		
		 System.out.println(x);
		
	System.out.println(y);
	
	
	WebElement element= driver.findElement(By.xpath(".//*[@id='car-type-menu']/li[4]"));
	
	         Actions action = new Actions(driver);
	         
	         action.moveToElement(element, 25, 209).click().build().perform();
	         
	        Thread.sleep(3000);
		  
		
		      
		
		
	}

}
