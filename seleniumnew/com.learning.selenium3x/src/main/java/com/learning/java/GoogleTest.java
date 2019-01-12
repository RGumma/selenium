package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	public static void main(String...args){
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	/*driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());
		WebElement textField = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		textField.sendKeys("Selenium Test");
		textField.submit();
		System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());*/
		//driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div[1]/div/div/h3/a")).click();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		JavascriptExecutor js = 
		
		
		
		
		
		
		
		
	}
}
