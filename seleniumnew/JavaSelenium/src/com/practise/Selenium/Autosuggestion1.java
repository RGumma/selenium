package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://easyautocomplete.com/");
		
		driver.findElement(By.id("countries")).click();
		
		driver.findElement(By.id("countries")).sendKeys("Indi");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='eac-container-countries']/ul/li[2]/div/b")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
