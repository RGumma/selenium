package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejetnew {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		
		Thread.sleep(3000);

		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@name='dropdown']/option"));
		
		System.out.println(dropdown.size());
		
		System.out.println(dropdown.get(1).getText());
		
		dropdown.
		
		for (WebElement element : dropdown) {

		if (element.getText().equals("Physics")) {

				element.click();
			}

		}

	}

}
