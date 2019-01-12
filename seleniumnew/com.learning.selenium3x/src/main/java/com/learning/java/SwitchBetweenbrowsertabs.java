package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBetweenbrowsertabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(//a[text()='Projects']")), Keys.SHIFT).click().perform();
		
		
		act.keyDown(driver.findElement(By.xpath("//a[text()='Projects']")), Keys.SHIFT).click().perform();
		
		
		
		
	}

}
