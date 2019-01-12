package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/selectable/");
		driver.findElement(By.xpath("//a[@href='http://demoqa.com/selectable/']"));

		List<WebElement> selectable = driver
				.findElements(By.xpath("//ol[@id='selectable'][@class='ui-selectable']/li"));

		int count = selectable.size();

		System.out.println(count);

		for (int i = 0; i < count; i++) {

			String value = selectable.get(i).getText();

			if (value.equals("Item 5")){
				

			selectable.get(i).click();
			
			Thread.sleep(3000);
			break;

		}
			
		}

		driver.close();

	}

}
