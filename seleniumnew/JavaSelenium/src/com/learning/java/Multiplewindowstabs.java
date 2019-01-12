package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowstabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();

		driver.switchTo().window(parent);
		Set<String> child = driver.getWindowHandles();

		int count = child.size();

		System.out.println(count);
		for (String abc : child) {

			if (!parent.equals(abc)) {

				driver.switchTo().window(abc);
				System.out.println(driver.getTitle());

				driver.close();
			}
		}

		driver.switchTo().window(parent);

		driver.close();

	}

}
