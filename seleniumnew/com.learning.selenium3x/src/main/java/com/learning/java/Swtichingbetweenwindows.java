package com.learning.java;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swtichingbetweenwindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.mortgagecalculator.org/");

		driver.switchTo().frame("br1");
		
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath(".//*[@id='BRmoreInfo']/a"));

		String parentid = driver.getWindowHandle();
		
		Thread.sleep(3000);

		// System.out.println(parentid);

		element.click();

		Set<String> id = driver.getWindowHandles();

		Iterator it = id.iterator();

		while (it.hasNext()) {

			String childid = it.next().toString();

			if (!childid.contains(parentid)) {

				driver.switchTo().window(childid);

				System.out.println(driver.getTitle());

				Assert.assertTrue("correct tile",
				 driver.getTitle().equals("Home Mortgage Rates | Search for Mortgage Rates"));

				
				
			}

		}

		
		
		driver.close();

	}

}
