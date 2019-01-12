package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();

		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	WebElement	table =driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));

		List<WebElement> rows = driver.findElements(By.tagName("tr"));

		int count = rows.size();

		for (int i = 0; i < count; i++) {

			List<WebElement> coloumn = rows.get(i).findElements(By.tagName("td"));

			int count1 = coloumn.size();

			for (int j = 0; j < count1; j++) {

				String name = coloumn.get(j).getText();

				System.out.println(name);

			}

		}

		driver.close();
	}
}
