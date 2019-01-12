package com.learning.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webapplicationpractice {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
		WebDriverWait  wd = new WebDriverWait(driver, 5);
		
		driver.findElement(By.id(".//*[@id='package-origin']")).sendKeys("df");
		
		driver.findElement(By.xpath(".//*[@id='package-origin']")).sendKeys("df");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div")));
		driver.findElement(By.xpath(".//*[@id='aria-option-0']/div")).click();
		driver.findElement(By.xpath(".//*[@id='package-destination']")).sendKeys("chi");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div")));
		driver.findElement(By.xpath(".//*[@id='aria-option-5']/div")).click();
		driver.findElement(By.xpath(".//*[@id='package-departing']")).click();
		driver.findElement(By.xpath(".//*[@id='package-departing-wrapper']/div/div/div[2]/table/tbody/tr[4]/td[4]/button")).click();
		driver.findElement(By.xpath(".//*[@id='package-returning']")).click();
		driver.findElement(By.xpath(".//*[@id='package-returning-wrapper']/div/div/div[3]/table/tbody/tr[2]/td[4]/button")).click();
		driver.findElement(By.xpath(".//*[@id='search-button']")).click();
		
		
		
		//File fi  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(fi, new File("c:\\google.png"));
		
		
		
		
		
		
	}

}
