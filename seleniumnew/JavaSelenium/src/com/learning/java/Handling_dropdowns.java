package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Handling_dropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		WebElement month = driver.findElement(By.id("month"));

		Select month_drop = new Select(month);
		
		driver.findElement(By.tagName())

		// month_drop.selectByVisibleText("May");

		// month_drop.selectByIndex(3);

		// month_drop.selectByValue("2");

		// month_drop.deselectByVisibleText("May");

		List<WebElement> drp_count = month_drop.getOptions();

		String value = drp_count.get(1).getText();

		System.out.println(value);

		int count = drp_count.size();

		System.out.println(count);
		
		//month_drop.

		WebElement element = month_drop.getFirstSelectedOption();

		System.out.println(element.getText());

		Assert.assertFalse(month_drop.isMultiple());

		Thread.sleep(3000);

		driver.close();

	}

}
