package com.learning.java;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html?m=1");
		
		driver.switchTo().frame("myweb");
		
		driver.findElement(By.className("sendx-button-T10kP5lglPMgxr20t3do6h")).click();
		
		System.out.println(driver.getTitle());
		
		//Assert.assertTrue("Test is passed", actual_title.equals("Amazon.com:Selenium books"));
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
