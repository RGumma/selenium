package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Walgreens {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.walgreens.com/");
		
		Actions act = new Actions(driver);
		
		//WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Eye Health Supplements')]"));
		
		//element.click();
		
act.moveToElement(driver.findElement(By.xpath(".//*[@id='menu-cl']/a"))).moveToElement(driver.findElement(By.xpath(".//span[@value='Eye Health Supplements']"))).click().build().perform();
		
		
		
		
		
		
		
		
		
		

	}

}
