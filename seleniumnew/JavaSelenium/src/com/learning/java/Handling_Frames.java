package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Handling_Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html");

		driver.switchTo().frame("myweb");

		Thread.sleep(300);

		String Parent_id = driver.getWindowHandle();

		System.out.println(Parent_id);

		driver.findElement(By.xpath("//div[(text() ='Click here for More Details')]")).click();

		Set<String> allwindow = driver.getWindowHandles();

		int count = allwindow.size();

		System.out.println(count);

		for (String child : allwindow) {

			if (!Parent_id.equals(child)) {

				driver.switchTo().window(child);

				String name = driver.getTitle();

				System.out.println(name);

				driver.close();

			}
		}

		driver.switchTo().window(Parent_id);

		String name = driver.getTitle();

		System.out.println(name);

		driver.close();

	}

}
