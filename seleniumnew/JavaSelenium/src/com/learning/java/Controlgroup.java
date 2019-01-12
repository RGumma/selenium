package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controlgroup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/");

		driver.findElement(By.xpath("//a[@href='http://jqueryui.com/controlgroup/']")).click();

		driver.switchTo().frame(0);

		driver.findElement(By.xpath(".//*[@id='car-type-button']/span[1]")).click();

		List<WebElement> control = driver
				.findElements(By.xpath("//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']/ul/li"));

		int count = control.size();

		for (int i = 0; i < count; i++) {

			String value = control.get(i).getText();
			
		if (value.equals("Midsize car")) {

				control.get(i).click();

				break;

			}

		}

		Thread.sleep(3000);

		driver.close();

	}

}
