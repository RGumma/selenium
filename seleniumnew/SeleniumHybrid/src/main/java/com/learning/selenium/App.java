package com.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver",
				"C:\\DevCenter\\geckodriver-v0.19.0-win64\\geckodriver.exe");
    	System.setProperty("webdriver.firefox.marionette","true");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
    }
}
