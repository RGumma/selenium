package com.learning.java;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class W3schools {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.xpath(".//*[@id='customers']/tbody"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		// Assert.assertEquals(7, rows.size());

		System.out.println(rows.size());

		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			
			 System.out.println(col.size());

			for (int j = 0; j < col.size(); j++) {

				String value = col.get(j).getText();

				System.out.println(value);

			}

			System.out.println();
		}

		driver.close();

	}

}
