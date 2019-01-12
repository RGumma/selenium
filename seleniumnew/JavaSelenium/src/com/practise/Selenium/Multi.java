package com.practise.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		//System.out.println(driver.getTitle());
		
	String parentwindow =	driver.getWindowHandle();
		
	driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]")).click();
		
		System.out.println(driver.getTitle());
		
		//Set <String>windowids =driver.getWindowHandles();
		
		//for(String childwindow : windowids){
			
			
			//if(!childwindow.equals(parentwindow)){
				
				
				//driver.switchTo().window(childwindow);
				
				//System.out.println(driver.getTitle());
				
				//driver.close();
				
				//}
			 
		//}
		
		//driver.switchTo().window(parentwindow);
	
		
		
		
		
		
		
		

	}

}
