package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingdynamicRadiobuttons {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		// System.setProperty(FirefoxDriver.SystemProperty.BROWSER_BINARY,
		// "C:\\Users\\RaviCKota\\Downloads\\firefox-49.0.2.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		List<WebElement> Radio = driver.findElements(By.xpath("//input[@ name = 'lang' and  @type ='radio']"));

		int count = Radio.size();
		
		System.out.println(count);
		
		driver.close();

	}

}