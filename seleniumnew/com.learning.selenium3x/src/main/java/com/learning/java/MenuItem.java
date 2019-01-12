package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuItem {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/menu/");

		driver.switchTo().frame(0);

		List<WebElement> menuitem = driver.findElements(By.xpath(".//*[@id='menu']/li[6]/ul/li/ul/li/div"));

		int count = menuitem.size();

		for (int i = 0; i < count; i++) {

			String value = menuitem.get(i).getText();

			

		}

		driver.close();

	}

}
