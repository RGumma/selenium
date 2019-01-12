package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getcssvalue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		
		WebElement element= driver.findElement(By.name("btnK"));
		
		System.out.println(" color the button before mouse over" +element.getCssValue("color"));
		
		 
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		System.out.println("color of the button after mouse over" +element.getCssValue("color"));
		
		
		System.out.println("Font size of the button" +element.getCssValue("font-size") );
		
		System.out.println("Font weight of the button" +element.getCssValue("font-weight"));
		
		driver.close();
		
		

	}

}
