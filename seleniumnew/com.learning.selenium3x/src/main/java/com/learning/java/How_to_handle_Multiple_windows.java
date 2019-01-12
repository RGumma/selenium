package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class How_to_handle_Multiple_windows {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		String Parent = driver.getWindowHandle();

		System.out.println(Parent);

		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();

		Set<String> allwindows = driver.getWindowHandles();

		int count = allwindows.size();

		System.out.println("Total window size is " + count);

		for (String child : allwindows) {

			if (!Parent.equals(child))

			{
				driver.switchTo().window(child);
				WebElement element = driver.findElement(By.className("sfibbbc"));

				element.sendKeys("selenium");

				element.submit();
			}

		}

		driver.switchTo().window(Parent);

		driver.getTitle();

	}

}
