package com.learning.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class How_to_handle_alert_popups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/01/how-to-handle-promt-alert-in-selenium.html");

		/*
		 * driver.findElement(By.xpath(
		 * ".//*[@id='post-body-2194462542617317550']/button")).click();
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.sendKeys("Rajani");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * alert.accept();
		 */

		//driver.findElement(By.xpath(".//*[@id='post-body-1177277262238978080']/button")).click();
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();
		
		
		alert.dismiss();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
