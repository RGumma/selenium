package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Radiobuttons {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		driver.findElement(By.id("java")).click();
		
        driver.close();
	}

}
