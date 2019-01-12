package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/menu/");

		driver.findElement(By.xpath("//a[@href='http://demoqa.com/menu/']"));

		List<WebElement> Menu = driver.findElements(By.xpath("//div[@id='tabs-1']/div/div/ul/li/a"));

		int count = Menu.size();

		System.out.println("size of the list is" + " " + count);

		for (int i = 0; i < count; i++) {

			String value = Menu.get(i).getText();

			if (value.equals("Contact")) {

				Menu.get(i).click();
				
				Thread.sleep(3000);

				break;

			}

		}

		driver.close();

	}

}
