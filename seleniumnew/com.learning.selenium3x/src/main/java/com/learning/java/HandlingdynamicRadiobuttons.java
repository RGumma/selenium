package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingdynamicRadiobuttons {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_BINARY, "C:\\Users\\RaviCKota\\Downloads\\firefox-49.0.2.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElement(By.xpath("//input[@ name ='lang' and @ type= 'radio']")); 
		
		
		
		
		
		
		
		
	}

}
