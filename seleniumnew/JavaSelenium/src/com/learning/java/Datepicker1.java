package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Datepicker1 {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver = new FirefoxDriver();

		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		WebElement element = driver.findElement(By.id("datepicker"));

		element.click();
		//element.submit();

		List<WebElement> datepicker = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));

		int count = datepicker.size();

		System.out.println(count);

		for (int i = 0; i < count; i++) {

			String value = datepicker.get(i).getText();

			if (value.equals("16")) {

				Thread.sleep(3000);

				datepicker.get(i).click();

				String actual = datepicker.get(i).getText();
				System.out.println(actual);

				String date = driver.findElement(By.xpath(".//*[@id='datepicker']")).getAttribute("value");

				System.out.println(date);

				Assert.assertTrue(date.equals("05/16/2017"), "test is passed");

				// Assert.assertEquals(actual,
				// driver.findElement(By.xpath(".//*[@id='datepicker']")).getAttribute("datapicker"),
				// "test is passed");

				break;

			}

		}

		Thread.sleep(3000);

		driver.close();

	}

}
