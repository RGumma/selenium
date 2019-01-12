package com.learning.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));

		Boolean status = element.isDisplayed();

		if (status.equals(true)) {

			System.out.println("Element is present");

		} else {

			System.out.println("Element is not present");
		}

		driver.close();
		
	}

}
