package com.learning.java;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutput;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.base.Verify;

public class Gmail {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		String Expected = "Gmail";
		
		driver.getTitle();
		 
		//driver.findElement(By.id(".//*[@id='Email']")).sendKeys("g.rajanikota");
		
		//driver.findElement(By.id(".//*[@id='next']")).click();
				//driver.findElement(By.id(".//*[@id='Passwd']")).sendKeys("Krishna_1");
		//driver.findElement(By.id(".//*[@id='signIn'])")).click();
		
		
		//Assert.assertTrue(driver.getTitle().equals("Gmail"),"incorrect_title");
		Assert.assertFalse(driver.getTitle().equals("Gmail"),"correct_title");
		
		File fi = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(fi, new File("c://google.png"));
		driver.close();

	}

}
