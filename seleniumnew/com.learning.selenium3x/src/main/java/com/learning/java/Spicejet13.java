package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet13 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
	Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
		dropdown.selectByVisibleText("2 Adults");
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

	}

}
