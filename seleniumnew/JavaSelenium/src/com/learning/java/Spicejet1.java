package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[4]/a")).click();
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("pu");
        WebDriverWait  wt= new WebDriverWait(driver,10);
       // wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='citydropdown']/tbody/tr[2]/td[2]")));
        driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[3]/li[6]/a[text()=' Pune (PNQ)']")).click();
        WebElement  element = driver.findElement(By.id(".//*[@id='ctl00_mainContent_ddl_Adult']"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(1);
         
        driver.close();
		
		
	}

}
