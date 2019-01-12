package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widgetbuttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/button/");

		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/button/']"));

		WebElement element = driver.findElement(By.xpath(".//*[@id='content']/iframe"));

		driver.switchTo().frame(element);

		WebElement button = driver.findElement(By.xpath("html/body/div[1]/button"));

		Boolean enable = button.isEnabled();

		if (enable == false) {

			System.out.println("button is not enabled");

		} else {

			System.out.println("button is enables");

		}

		
		driver.close();
	}

}
