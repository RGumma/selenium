package com.learning.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Onlytestingblogspot {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		
		  
		
		
		
		
		
		
		

	}

}
