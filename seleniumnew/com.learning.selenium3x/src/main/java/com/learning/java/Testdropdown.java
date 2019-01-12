package com.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testdropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");

		driver.switchTo().frame("iframeResult");

		Select drop = new Select(driver.findElement(By.xpath("html/body/select")));
       List<WebElement> actual = drop.getOptions();
       
       Assert.assertFalse(drop.isMultiple());

		Assert.assertEquals(4, actual.size());
		// Verify whether dropdown as expected values or not

		String[] expectedArr = new String[] { "Volvo", "Saab", "Opel", "Audi" };
		String[] actualArr = new String[4];

		for (int i = 0; i < actual.size(); i++) {

			String values = actual.get(i).getText();

			actualArr[i] = values;

		}

		Assert.assertArrayEquals(expectedArr, actualArr);
		
		
		

		driver.quit();

	}

}
