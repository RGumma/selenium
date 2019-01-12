package com.learning.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		
	driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		//driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		Thread.sleep(10000);
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), "Are you sur you want to give us the deed to your house?", "Incorrect alert message");
		
		
		alert.accept();

		
		 Thread.sleep(3000);
		 
		 driver.close();
		
	}

}
