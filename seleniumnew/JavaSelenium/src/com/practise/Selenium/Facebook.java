package com.practise.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajinieee2006@yahoo.com");
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Z123Y321");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
	    
	    Thread.sleep(3000);
	    
	   driver.switchTo().alert().dismiss();
	    driver.findElement(By.xpath("//div[@role='search']")).click();
		driver.findElement(By.xpath(".//*[@id='js_6p']")).sendKeys("archana kav");
		driver.findElement(By.xpath(".//*[@id='js_4zd']/div/a/div")).click();
		
	    driver.close();
	    
	    
	    
		
		
		
		
		

	}

}
