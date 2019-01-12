package com.learning.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expedia12 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.expedia.com/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebDriverWait wb = new WebDriverWait(driver,2);
		
		Select dropdown = new Select(element);
				
				dropdown.
		
		wb.until(ExpectedConditions.
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("Atlanta, GA (ATL-All Airports");
		
		driver.findElement(By.xpath(".//*[@id='package-destination-hp-package']")).sendKeys("Austin,Texas");
		
		driver.findElement(By.id(id)
		
		driver.close();
		
	}

}
