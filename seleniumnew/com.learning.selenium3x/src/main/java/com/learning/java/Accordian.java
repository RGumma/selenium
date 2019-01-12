package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordian {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com");

		driver.findElement(By.xpath("//a[contains(text(),'Accordion')]")).click();

		driver.switchTo().frame(0);

		List<WebElement> accordain = driver.findElements(By.xpath("//div[@id='accordion']/h3"));

		int count = accordain.size();

		System.out.println(count);

		for (int i = 0; i < count; i++) {

			String value = accordain.get(i).getText();

			if (value.equals("Section 3")) {

				accordain.get(i).click();
				break;

			}

		}

		Thread.sleep(3000);

		driver.close();

	}

}
