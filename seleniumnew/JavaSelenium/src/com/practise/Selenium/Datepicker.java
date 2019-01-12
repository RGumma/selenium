package com.practise.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/");

		driver.findElement(By.linkText("Datepicker")).click();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		driver.findElement(By.id("datepicker")).click();

		List<WebElement> table = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));

		//List<WebElement> rows = table.findElements(By.tagName("tr"));

		 int count = table.size();

		 System.out.println(count);

		// for (int i = 0; i < count; i++) {

		//List<WebElement> col = table.findElements(By.tagName("td"));

		//int count1 = col.size();
		
		//System.out.println(count1);

		// for (int j = 0; j < count1; j++) {

		// String value = col.get(j).getText();

		// System.out.println(value);

		// }

		// }

		for (int i=0; i<count; i++) {

			String value = table.get(i).getText();
			
			System.out.println(value);

			}

		}

}


